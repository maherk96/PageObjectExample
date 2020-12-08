import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage {

    WebDriver driver;

    public ItemsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "input[name='search']")
    WebElement postCodeSearch;

    @FindBy(how = How.CSS, using = "[data-test='fulfilment-search-stock-search-button']")
    WebElement checkStockButton;

    @FindBy(how = How.CSS, using = ".add-to-trolley-main.top-border.xs-row  button[role='button'] > span > span")
    WebElement addToTrolley;

    @FindBy(how = How.CSS, using = ".Modalstyles__ButtonSpacer-m74fhr-2.hPvarY.sm-6--none.sm-order-2.xs-12.xs-order-1 > a[role='button']")
    WebElement confirmToAddItem;

    public void addToTrolley(String customerPostCode) {
       postCodeSearch.sendKeys(customerPostCode);
       checkStockButton.click();
       addToTrolley.click();
       confirmToAddItem.click();
    }

}
