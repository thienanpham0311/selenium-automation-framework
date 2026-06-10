package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPage;

public class DynamicTest extends BaseTest
{
    @Test
    public void DynamicTestFlow() throws InterruptedException
    {
        DynamicPage dynamicPage = new DynamicPage(driver);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicPage.selectCheckbox();
        dynamicPage.clickRemoveBtn();
        dynamicPage.waitForMessage();
        // old-school verify
        dynamicPage.verifyMessage();

// modern assert
        Assert.assertTrue(
                dynamicPage.getMessage()
                        .contains("gone")
        );
        dynamicPage.clickEnable();
        dynamicPage.waitForInput();
        dynamicPage.typeText("ahihi");
        dynamicPage.verifyEnable();

    }
}
