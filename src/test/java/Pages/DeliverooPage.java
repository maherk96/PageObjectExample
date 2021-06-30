package Pages;

import Helper.BaseScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class DeliverooPage extends BaseDriver {

    protected static final Logger LOGGER = Logger.getLogger(DeliverooPage.class.getName());


    public DeliverooPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "[class] li:nth-of-type(2) [class='ccl-19882374e640f487 ccl-417df52a76832172 ccl-deab34eb04186352 ccl-d20a5732188988de ccl-6a536dee6972c57c']")
    public static  WebElement SIGN_IN_BUTTON;

    @FindBy(how = How.CSS, using = ".ccl-cce251427bbe4ec4")
    public static WebElement CONTINUE_WITH_MAIL;

    @FindBy(how = How.ID, using = "email-address")
    WebElement emailAddressField;

    @FindBy(how = How.CSS, using = ".ccl-233931c277401e86.ccl-a97a150ddadaa172.ccl-d0484b0360a2b432.ccl-ed9aadeaa18a9f19 > .ccl-cce251427bbe4ec4")
    public static WebElement CONTINUE_EMAIL;

    @FindBy(how = How.ID, using = "login-password")
    WebElement loginPass;

    @FindBy(how = How.CSS, using = ".ccl-233931c277401e86.ccl-a97a150ddadaa172.ccl-d0484b0360a2b432.ccl-ed9aadeaa18a9f19 > .ccl-cce251427bbe4ec4")
    public static WebElement LOGIN_BUTTON;

    @FindBy(how = How.CSS, using = ".ccl-985cb265c6f6a9c1")
    public static WebElement ACCOUNT_MENU;

    @FindBy(how = How.CSS, using = "li:nth-of-type(1) > .ccl-b757c6f9e5f59909")
    public static WebElement IN_MENU;

    @FindBy(how = How.CSS, using = ".ccl-94e7181efee87257.ccl-ae2a4cc7a151dafd > .ccl-19882374e640f487.ccl-1f89da61a98d89af.ccl-417df52a76832172")
    public static WebElement DELIVEROO_TRIAL;

    @FindBy(how = How.CSS, using = ".ccl-19882374e640f487.ccl-1daa0367dee37c3b.ccl-deab34eb04186352")
    public static WebElement CANCEL_TRIAL;

    @FindBy(how = How.CSS, using = ".ccl-84274627c639e05a.ccl-a97a150ddadaa172.ccl-d0484b0360a2b432.ccl-ed9aadeaa18a9f19 > .ccl-cce251427bbe4ec4")
    public static WebElement CONFIRM_CANCEL;

    @FindBy(how = How.CSS, using = ".ccl-0a8746bfe85ebfa3.ccl-233931c277401e86.ccl-a97a150ddadaa172.ccl-d0484b0360a2b432.ccl-ed9aadeaa18a9f19 > .ccl-cce251427bbe4ec4")
    public static WebElement DONE_OK;

    @FindBy(how = How.CSS, using = "[class='ccl-9aab795066526b4d'] [type]")
    public static WebElement passwordText;

    @FindBy(how = How.CSS, using = ".ccl-cce251427bbe4ec4")
    public static WebElement CONTINUE;

    @FindBy(how = How.CSS, using = ".ccl-84274627c639e05a.ccl-d0484b0360a2b432.ccl-ed9aadeaa18a9f19 > .ccl-cce251427bbe4ec4")
    public static WebElement DEACTIVATE;


    public DeliverooPage userClicksElement(WebElement element) throws InterruptedException {
        Thread.sleep(1000);
        element.click();
        return this;
    }

    public DeliverooPage userEntersEmailAddress(String email) {

        emailAddressField.sendKeys(email);
        return this;
    }

    public DeliverooPage userEntersPassword() throws InterruptedException {
        Thread.sleep(1000);

        loginPass.sendKeys(("password"));
        return this;
    }

    public DeliverooPage userEntersPasswordForDeactivation() throws InterruptedException {
        Thread.sleep(1000);
        passwordText.sendKeys(("password"));
        return this;
    }

//    public void loopNumberEmail () {
//        String email = "t";
//        String emailDomain = "@tt.tt";
//
//        int temp = 100;
//
//        IntStream.range(0 , temp).forEach(i -> {
//
//            LOGGER.info("email {}", email + i + emailDomain);
//        });
//
//        IntStream i = IntStream.range(0,100);
//
//
//
//
//
//
//    }

}