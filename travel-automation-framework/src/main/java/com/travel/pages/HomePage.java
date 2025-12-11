package com.travel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By flightsSection = By.id("flights");
    private By sourceInput = By.id("source");
    private By destinationInput = By.id("destination");
    private By searchButton = By.id("searchButton");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFlights() {
        driver.findElement(flightsSection).click();
    }

    public void enterSource(String source) {
        driver.findElement(sourceInput).sendKeys(source);
    }

    public void enterDestination(String destination) {
        driver.findElement(destinationInput).sendKeys(destination);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}