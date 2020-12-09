import Helper.BaseScript;
import org.testng.annotations.*;

public class ArgosOrderItems extends BaseScript {

    @Test(enabled = false)
    public void orderItemAndCheckQuantityWithPrice() {

        argosHomePage.searchForAItem("474/1925");
        itemsPage.addToTrolley("RM6 4XP", 1);
        itemsPage.verifyPriceAndQuantityOrdered(1, 54.99);

    }

    @Test(enabled = false)
    public void ArgosTrolleyHomePagePath() {

        argosHomePage.navigateToTrolleyFromHomePage();
        argosHomePage.verifyEmptyTrolleyText("Empty trolley!");
        argosHomePage.verifyReturnToHomePage();

    }

    @Test
    public void ArgosTrolleyHomePagePathV1() {

        argosHomePage
                .navigateToTrolleyFromHomePage()
                .verifyEmptyTrolleyText("Empty trolley!")
                .verifyReturnToHomePage();

    }

}