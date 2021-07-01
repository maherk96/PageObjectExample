import Helper.BaseScript;
import Pages.DeliverooPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static Pages.DeliverooPage.*;

public class DeliverooTests extends BaseScript {

    @Test
    public void deleteDeliverooUser() {

        String[] arr = {"email"};

        Arrays.stream(arr).forEach(i -> {

            try {

                deliverooActor

                        .userClicksElement(SIGN_IN_BUTTON)
                        .userClicksElement(CONTINUE_WITH_MAIL)
                        .userEntersEmailAddress(i)
                        .userClicksElement(CONTINUE_EMAIL)
                        .userEntersPassword()
                        .userClicksElement(LOGIN_BUTTON)
                        .userClicksElement(ACCOUNT_MENU)
                        .userClicksElement(IN_MENU)
                        .userClicksElement(DELIVEROO_TRIAL)
                        .userClicksElement(CANCEL_TRIAL)
                        .userClicksElement(CONFIRM_CANCEL)
                        .userClicksElement(DONE_OK)
                        .userEntersPasswordForDeactivation()
                        .userClicksElement(CONTINUE)
                        .userClicksElement(DEACTIVATE);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
