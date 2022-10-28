package com.abu.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class Driver {
    private static WebDriver webDriver;

    private Driver() {}

    public static WebDriver getDriver() {
        if (webDriver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                    break;
            }
            webDriver.manage().window().maximize();
        }

        return webDriver;
    }

    public static void closeDriver(){
        webDriver.close();
    }
}
