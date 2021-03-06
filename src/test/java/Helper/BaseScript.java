package Helper;

import Pages.DeliverooPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseScript {

    protected WebDriver driver;
    public static String baseUrl = "https://deliveroo.co.uk/";
    protected static final Logger LOGGER = Logger.getLogger(BaseScript.class.getName());
    protected DeliverooPage deliverooActor;

    @BeforeSuite
    public void doBeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    }

    @BeforeMethod
    public void doBeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        deliverooActor = new DeliverooPage(driver);
    }

    @AfterMethod
    public void doAfterMethod() {
        driver.quit();
    }

}