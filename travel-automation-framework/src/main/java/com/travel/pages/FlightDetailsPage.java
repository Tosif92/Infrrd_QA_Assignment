package com.travel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightDetailsPage {
    private WebDriver driver;

    // Locators for flight details
    private By cheapestFlightLocator = By.id("cheapest-flight");
    private By secondCheapestFlightLocator = By.id("second-cheapest-flight");

    public FlightDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printCheapestFlightDetails() {
        String cheapestFlightDetails = driver.findElement(cheapestFlightLocator).getText();
        System.out.println("Cheapest Flight Details: " + cheapestFlightDetails);
    }

    public void printSecondCheapestFlightDetails() {
        String secondCheapestFlightDetails = driver.findElement(secondCheapestFlightLocator).getText();
        System.out.println("Second Cheapest Flight Details: " + secondCheapestFlightDetails);
    }
}