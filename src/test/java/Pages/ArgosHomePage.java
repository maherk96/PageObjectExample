package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Helper.BaseScript.baseUrl;

public class ArgosHomePage extends BasePage {

    public ArgosHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Ps5 Console")
    WebElement ps5Tab;

    @FindBy(how = How.ID, using = "searchTerm")
    WebElement searchBox;

    @FindBy(how = How.CSS, using = "._2mKaC > ._1gqeQ")
    WebElement searchConfirm;

    @FindBy(how = How.CSS, using = "button#consent_prompt_submit")
    public static WebElement acceptCookies;

    @FindBy(how = How.CSS, using = "._3PDl0 [tabindex='1']:nth-of-type(4) ._2wsKA")
    WebElement trolleyButton;

    @FindBy(how = How.CSS, using = ".EmptyBasketPanel__title__2L-Wf")
    WebElement emptyTrolleyVerification;

    @FindBy(how = How.LINK_TEXT, using = "Start shopping")
    WebElement startShopping;

    public ArgosHomePage searchForAItem(String productID) {
        acceptCookies.click();
        searchBox.sendKeys(productID);
        searchConfirm.click();
        return this;
    }

    public ArgosHomePage navigateToTrolleyFromHomePage(){
        acceptCookies.click();
        trolleyButton.click();
        return this;
    }

    public ArgosHomePage verifyEmptyTrolleyText(String text){
        Assert.assertEquals(emptyTrolleyVerification.getText(), text);
        return this;
    }

    public void verifyReturnToHomePage(){
        startShopping.click();
        Assert.assertEquals(driver.getCurrentUrl(), baseUrl);
    }

}
