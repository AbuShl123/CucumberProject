package com.abu.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public final class Driver {

    private static final InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    private Driver() {}

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            String browser = ConfigurationReader.getProperty("browser");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("lang=en-GB");
            switch (browser) {
                default: throw new IllegalArgumentException("unknown browser type: " + browser);
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(options));
                    break;
                case "remote-chrome":
                    try {
                        URL url = new URL("http://192.168.100.71:4444");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        desiredCapabilities.setPlatform(Platform.WIN10);
                        desiredCapabilities.merge(options);
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                case "remote-firefox":
                    try {
                        URL url = new URL("http://192.168.100.71:4444");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        desiredCapabilities.setPlatform(Platform.WIN10);
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    break;
            }
            driverPool.get().manage().window().maximize();
        }

        return driverPool.get();
    }

    public static void closeDriver(){
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
