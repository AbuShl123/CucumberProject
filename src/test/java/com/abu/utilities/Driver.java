package com.abu.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class Driver extends DriverBase{

    private static final InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    private Driver() {}

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            switch (BROWSER) {
                default: throw new IllegalArgumentException("unknown browser type: " + BROWSER);
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(OPTIONS));
                    break;
                case "remote-chrome":
                    desiredCapabilities.setBrowserName("chrome");
                    desiredCapabilities.setPlatform(Platform.WIN10);
                    desiredCapabilities.merge(OPTIONS);
                    driverPool.set(new RemoteWebDriver(_URL, desiredCapabilities));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                case "remote-firefox":
                    desiredCapabilities.setBrowserName("firefox");
                    desiredCapabilities.setPlatform(Platform.WIN10);
                    driverPool.set(new RemoteWebDriver(_URL, desiredCapabilities));
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
