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
    public void deleteDeliverooUser() throws InterruptedException {

        String[] arr = {"t34@tt.tt", "t35@tt.tt", "t36@tt.tt", "t37@tt.tt", "t38@tt.tt", "t39@tt.tt", "t40@tt.tt"};

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

                        .userEntersPasswordForDeactivation()

                        .userClicksElement(CONTINUE)
                        .userClicksElement(DEACTIVATE);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
