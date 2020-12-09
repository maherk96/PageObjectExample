package Helper;

import Pages.ArgosHomePage;
import Pages.ItemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Pages.ArgosHomePage.acceptCookies;

public class BaseScript {



    protected WebDriver driver;
    protected ArgosHomePage argosHomePage;
    protected ItemsPage itemsPage;
    public static String baseUrl = "https://www.argos.co.uk/";
    private static final Logger logger = Logger.getLogger(BaseScript.class.getName());

    public void acceptCookies() {
        acceptCookies.click();
    }

    public static Integer checkQuantityLevel(int quantity) {
        if (quantity < 1 || quantity > 10) {
            logger.log(Level.WARNING, "Order Quantity 1 > 10, Enter valid Quantity");
            throw new UnsupportedOperationException();
        } else {
            return quantity;
        }
    }

    @BeforeSuite
    public void doBeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/mac/chrome/chromedriver");
    }

    @BeforeMethod
    public void doBeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        argosHomePage = new ArgosHomePage(driver);
        itemsPage = new ItemsPage(driver);
    }

    @AfterMethod
    public void doAfterMethod() {
        driver.quit();
    }

}