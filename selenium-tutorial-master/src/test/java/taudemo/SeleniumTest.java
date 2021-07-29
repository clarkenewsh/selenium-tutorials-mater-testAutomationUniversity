package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

//comment

/**
 * Javadoc
 */

//todo
@SuppressWarnings("CanBeFinal")
@TestInstance(PER_CLASS)
public class SeleniumTest {
    // Get the browser getter class from the projects directory to set the browser getter method to start the browser
    @SuppressWarnings("CanBeFinal")
    private BrowserGetter browserGetter = new BrowserGetter();

    // Web Driver field - use web driver on the new browser object
    private WebDriver driver;

    // Before each test execute
    @BeforeEach
    public void beforeAll() {
        // Call the get chrome driver method from the browser getter class and store the result in the WeDriver field
        driver = browserGetter.getChromeDriver();
    }

    // After each test execute
    @AfterAll
    public void afterAll() {
        // Quit the driver using the driver quid method
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {

        // Variable to hold the expected title which we can then assert the value
        String expectedComTitle = "Example Domain";

        // Open the page
        driver.get("https://www.example.com");

        // Assert the expected title equals the page title
        assertEquals(expectedComTitle, driver.getTitle());
    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {

        // Variable to hold the expected title which we can then assert the value
        String expectedOrgTitle = "Example Domain";

        // Open the page
        driver.get("https://www.example.org");

        // Assert the expected title equals the page title
        assertEquals(expectedOrgTitle, driver.getTitle());
    }





// TUTORIAL COMPLETED CODE
// -------------------------------

//    private BrowserGetter browserGetter = new BrowserGetter();
//    private WebDriver driver;
//
//    @BeforeAll
//    public void beforeAll() {
//        driver = browserGetter.getChromeDriver();
//    }
//
//    @AfterAll
//    // After all used to quit the driver each time
//    public void afterAll() {
//        driver.quit();
//    }
//
//    @Test
//    public void openTheComPageAndCheckTheTitle() {
//        String expectedComTitle = "Example Domain";
//        driver.get("https://www.example.com");
//        assertEquals(expectedComTitle, driver.getTitle());
//    }
//    @Test
//    public void openTheOrgPageAndCheckTheTitle() {
//        String expectedOrgTitle = "Example Domain";
//        driver.get("https://www.example.org");
//        assertEquals(expectedOrgTitle, driver.getTitle());
//    }
}
