package com.travel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchResultsPage {

    private WebDriver driver;

    // Locators
    private By flightResults = By.cssSelector(".flight-result");
    private By searchButton = By.id("search-button");
    private By dateSelector = By.id("date-selector");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDate(String date) {
        WebElement dateElement = driver.findElement(dateSelector);
        dateElement.sendKeys(date);
    }

    public void clickSearchButton() {
        WebElement button = driver.findElement(searchButton);
        button.click();
    }

    public List<WebElement> getFlightResults() {
        return driver.findElements(flightResults);
    }

    public void printFlightDetails() {
        List<WebElement> results = getFlightResults();
        for (WebElement result : results) {
            System.out.println(result.getText());
        }
    }
}