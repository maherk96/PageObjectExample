package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ArgosHomePage extends BaseDriver {

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
    WebElement acceptCookies;

    @FindBy(how = How.CSS, using = ".EmptyBasketPanel__title__2L-Wf")
    WebElement emptyTrolleyVerification;

    public void searchForAItem(String productID) {
        acceptCookies.click();
        searchBox.sendKeys(productID);
        searchConfirm.click();
    }

}
