Travel Automation Framework
This project is an automation framework for testing a travel website using Java, Maven, TestNG, and Selenium. It follows the Page Object Model (POM) design pattern to enhance maintainability and readability of the test code.

Project Structure
travel-automation-framework
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── travel
│   │   │           ├── base
│   │   │           │   └── BasePage.java
│   │   │           ├── pages
│   │   │           │   ├── HomePage.java
│   │   │           │   ├── SearchResultsPage.java
│   │   │           │   └── FlightDetailsPage.java
│   │   │           └── utils
│   │   │               ├── DriverFactory.java
│   │   │               ├── ConfigReader.java
│   │   │               └── WaitUtils.java
│   │   └── resources
│   │       └── config.properties
│   └── test
│       ├── java
│       │   └── com
│       │       └── travel
│       │           ├── base
│       │           │   └── BaseTest.java
│       │           └── tests
│       │               └── FlightSearchTest.java
│       └── resources
│           └── testng.xml
├── drivers
├── pom.xml
├── .gitignore
└── README.md
Setup Instructions
Clone the Repository

git clone <repository-url>
cd travel-automation-framework
Install Dependencies Ensure you have Maven installed. Run the following command to install the required dependencies:

mvn clean install
Configure WebDriver Place the WebDriver executables for your preferred browsers in the drivers directory.

Update Configuration Modify the src/main/resources/config.properties file to set the URL of the travel website and any other necessary configurations.

Running Tests
To execute the tests, use the following command:

mvn test
Framework Components
BasePage: Contains common methods for all page objects.
HomePage: Represents the home page of the travel website.
SearchResultsPage: Represents the search results page and includes methods for searching flights.
FlightDetailsPage: Displays flight details and methods to print the cheapest flights.
DriverFactory: Initializes the WebDriver based on the specified browser.
ConfigReader: Reads configuration properties from the properties file.
WaitUtils: Provides methods for implementing explicit waits.
Test Classes
BaseTest: Sets up the TestNG environment and manages WebDriver lifecycle.
FlightSearchTest: Automates the flight search process and prints flight details.
Contribution
Feel free to fork the repository and submit pull requests for any improvements or bug fixes.
