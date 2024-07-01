package com.sparta.swaggerlabstests.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class StepDefsSuper {
    protected static ChromeDriverService service;
    protected static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    protected static WebDriver webDriver;

    protected static final String ROOT_URL = "https://www.saucedemo.com/v1/";

    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        return chromeOptions;
    }
}
