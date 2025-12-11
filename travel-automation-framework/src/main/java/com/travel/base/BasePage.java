package com.travel.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}