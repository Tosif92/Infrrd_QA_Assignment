package com.travel.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", "drivers/msedgedriver");
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Browser not supported: " + browser);
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}