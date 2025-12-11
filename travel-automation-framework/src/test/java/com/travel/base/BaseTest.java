package com.travel.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.travel.utils.DriverFactory;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.initializeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("URL_OF_TRAVEL_WEBSITE"); // Replace with actual URL from config
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}