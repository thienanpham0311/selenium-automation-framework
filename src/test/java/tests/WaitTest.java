package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ButtonPage;



public class WaitTest extends BaseTest {

    @Test
    public void waitTestFlow() throws InterruptedException{

        // ================= PAGE 1 =================

        ButtonPage buttonPage =
                new ButtonPage(driver);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        Thread.sleep(5000);
        buttonPage.clickbtn();
        // ================= PAGE 2 =================
        Thread.sleep(8000);
        Assert.assertEquals(buttonPage.getText(),"Hello World!");

    }
}