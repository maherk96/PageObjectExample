import Helper.BaseScript;
import org.testng.annotations.*;

public class ArgosOrderItems extends BaseScript {

    @Test
    public void unitLevel1() {

       argosHomePage.searchForAItem("474/1925");
       itemsPage.addToTrolley("RM6 4XP");

//       itemsPage.postCodeSearch.sendKeys("RM6 4XP");
//       itemsPage.checkStockButton.click();
//       itemsPage.addToTrolley.click();
//       itemsPage.confirmToAddItem.click();

    }

}
