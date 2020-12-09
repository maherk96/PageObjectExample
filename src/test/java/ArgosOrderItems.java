import Helper.BaseScript;
import org.testng.annotations.*;

public class ArgosOrderItems extends BaseScript {

    @Test
    public void orderItemAndCheckQuantityWithPrice() {

        argosHomePage.searchForAItem("392/2604");
        itemsPage.verifyPriceAndQuantityOrdered("RM6 4XP", 3);

    }

    @Test(enabled = false)
    public void ArgosTrolleyHomePagePath() {

        argosHomePage.navigateToTrolleyFromHomePage();
        argosHomePage.verifyEmptyTrolleyText("Empty trolley!");
        argosHomePage.verifyReturnToHomePage();

    }

    @Test(enabled = false)
    public void ArgosTrolleyHomePagePathV1() {

        argosHomePage
                .navigateToTrolleyFromHomePage()
                .verifyEmptyTrolleyText("Empty trolley!")
                .verifyReturnToHomePage();

    }

}