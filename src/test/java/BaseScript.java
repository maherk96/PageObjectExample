import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseScript {


    WebDriver driver = new ChromeDriver();
    String baseUrl = "https://www.argos.co.uk";

    ArgosHomePage argosHomePage = new ArgosHomePage(driver);
    ItemsPage itemsPage = new ItemsPage(driver);

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
