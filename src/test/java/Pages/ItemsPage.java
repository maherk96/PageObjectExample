package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Helper.BaseScript.checkQuantityLevel;

public class ItemsPage extends BasePage {

    public ItemsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "select#add-to-trolley-quantity")
    WebElement quantityDropdown;

    @FindBy(how = How.CSS, using = "input[name='search']")
    WebElement postCodeSearch;

    @FindBy(how = How.CSS, using = "[data-test='fulfilment-search-stock-search-button']")
    WebElement checkStockButton;

    @FindBy(how = How.CSS, using = ".add-to-trolley-main.top-border.xs-row  button[role='button'] > span > span")
    WebElement addToTrolley;

    @FindBy(how = How.CSS, using = ".Modalstyles__ButtonSpacer-m74fhr-2.hPvarY.sm-6--none.sm-order-2.xs-12.xs-order-1 > a[role='button']")
    WebElement confirmToAddItem;

    @FindBy(how = How.CSS, using = ".ProductCard__productLinePrice__3QC7V")
    WebElement price;

    @FindBy(how = How.CSS, using = "ul  h2")
    WebElement priceOfProduct;

    public WebElement findByCss (String cssValue) {
       return driver.findElement(By.cssSelector(cssValue));
    }

    public void verifyPriceAndQuantityOrdered (String customerPostCode, int enterQuantityToOrder) {
        String temp1 = priceOfProduct.getText();
        double priceOfProductWithout£ = Double.parseDouble(temp1.replace("\u00A3", ""));

        quantityDropdown.click();
        findByCss("[value='" + checkQuantityLevel(enterQuantityToOrder) + "']").click();
        postCodeSearch.sendKeys(customerPostCode);
        checkStockButton.click();
        addToTrolley.click();
        confirmToAddItem.click();

        double temp3 = enterQuantityToOrder * priceOfProductWithout£;
        double price1 = Double.parseDouble(price.getText().replace("\u00A3", ""));
        Assert.assertEquals(price1,  temp3);
    }

}
