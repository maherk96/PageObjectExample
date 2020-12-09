package Helper;


import Pages.ArgosHomePage;
import Pages.ItemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import static Pages.ArgosHomePage.acceptCookies;

public class BaseScript {

    protected WebDriver driver;
    protected ArgosHomePage argosHomePage;
    protected ItemsPage itemsPage;

    public static String baseUrl = "https://www.argos.co.uk/";


    public void acceptCookies() {
        acceptCookies.click();
    }

    @BeforeSuite
    public void doBeforeSuite() {
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/mac/chrome/chromedriver");


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