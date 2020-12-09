package Helper;


import Pages.ArgosHomePage;
import Pages.ItemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import static Pages.ArgosHomePage.acceptCookies;

public class BaseScript {

    WebDriver driver = new ChromeDriver();
    public static String baseUrl = "https://www.argos.co.uk/";

    public ArgosHomePage argosHomePage = new ArgosHomePage(driver);
    public ItemsPage itemsPage = new ItemsPage(driver);

    public void acceptCookies() {
        acceptCookies.click();
    }

    @BeforeSuite
    public void doBeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @BeforeTest
    public void doBeforeTest() {
        driver.get(baseUrl);
    }

    @AfterMethod
    public void doAfterMethod() {
        driver.close();
    }

}