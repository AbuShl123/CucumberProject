package com.abu.utilities;

import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class DriverBase {

    /**
     * OPTIONS: to configure chrome options
     */
    protected static final ChromeOptions OPTIONS;

    /**
     * BROWSER: to configure browser type;
     */
    protected static final String BROWSER;

    /**
     * _URL: where to run remote driver?
     */
    protected static final URL _URL;


    /*
     * static blocks for initializing
     */
    static {
        OPTIONS = new ChromeOptions();
        OPTIONS.addArguments("--incognito");
        OPTIONS.addArguments("lang=en-GB");
    }

    static {
        if (System.getProperty("BROWSER") != null) {
            BROWSER = System.getProperty("BROWSER");
        } else {
            BROWSER = ConfigurationReader.getProperty("browser");
        }
    }

    static {
        URL temporal;
        try {
            temporal = new URL("http://192.168.100.71:4444");
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("_URL IS NOT CORRECT");
        }
        _URL = temporal;
    }
}
