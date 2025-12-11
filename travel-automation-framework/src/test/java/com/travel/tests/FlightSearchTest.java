import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.travel.base.BaseTest;
import com.travel.pages.HomePage;
import com.travel.pages.SearchResultsPage;
import com.travel.pages.FlightDetailsPage;

public class FlightSearchTest extends BaseTest {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private FlightDetailsPage flightDetailsPage;

    @BeforeClass
    public void setUp() {
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        flightDetailsPage = new FlightDetailsPage(driver);
        driver.get("URL_OF_TRAVEL_WEBSITE"); // Replace with actual URL
    }

    @Test
    public void testFlightSearch() {
        homePage.enterSource("New York");
        homePage.enterDestination("Los Angeles");
        searchResultsPage.selectDate("2023-12-15"); // Replace with actual date
        searchResultsPage.clickSearchButton();
        
        String cheapestFlightDetails = flightDetailsPage.getCheapestFlightDetails();
        String secondCheapestFlightDetails = flightDetailsPage.getSecondCheapestFlightDetails();
        
        System.out.println("Cheapest Flight: " + cheapestFlightDetails);
        System.out.println("Second Cheapest Flight: " + secondCheapestFlightDetails);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}