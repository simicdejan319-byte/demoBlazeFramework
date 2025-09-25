package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.BasePage;

import java.time.Duration;

public class BaseTests {

    protected static WebDriver driver;
    protected static BasePage basePage;

    @BeforeClass
    public static void beforeClass() throws Exception {

        driver = new FirefoxDriver();
        System.out.println("Ne raditi git pull");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//        max time to wait for a page load
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//        max time for asynchronous JS run
        basePage = new BasePage(driver, Duration.ofSeconds(10));
    }

    @Before
    public void setUp() throws Exception {
        basePage.navigateTo("https://demoblaze.com/");
    }
    @After
    public void afterEach() {
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public static void afterAll() {
        driver.quit();
    }


}
