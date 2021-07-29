package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

// Test instance with per class =
@SuppressWarnings("CanBeFinal")
@TestInstance(PER_CLASS)
public class WithConfigurationTest {

    // Get the browser getter class from the projects directory to set the browser getter method to start the browser
    @SuppressWarnings("CanBeFinal")
    private BrowserGetter browserGetter = new BrowserGetter();

    // create web driver driver field
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void justATest() {
        driver.get("https://www.example.com");
        assertEquals("Example Domain", driver.getTitle());
    }
}





// TUTORIAL COMPLETED CODE
// -------------------------------

//@TestInstance(PER_CLASS)
//public class WithConfigurationTest {
//    private BrowserGetter browserGetter = new BrowserGetter();
//    private WebDriver driver;
//
//    @BeforeAll
//    public void beforeAll() {
//        driver = browserGetter.getDriver();
//    }
//
//    @AfterAll
//    public void afterAll() {
//        driver.quit();
//    }
//
//    @Test
//    public void justATest() {
//        driver.get("https://www.example.com");
//        assertEquals("Example Domain", driver.getTitle());
//    }
//}

