package tests;
import config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.HDAccInfoPage;
import pages.HDHomePage;
import flows.LoginFlowHD;
import base.BaseTest;
import config.ConfigReader;


public class HDAccountVerifyTest extends BaseTest{

    @Test
    public void verifyLogin() throws InterruptedException {
        HDHomePage homePage =
                new HDHomePage(driver);
        HDAccInfoPage accInfoPage = new HDAccInfoPage(driver);

        LoginFlowHD loginFlow =
                new LoginFlowHD(homePage);
        driver.get(
                ConfigReader.getBaseUrl()
        );

        loginFlow.login(
                "jiroupham",
                "onlylove"
        );

        homePage.clickProfile();
        homePage.clickAccInfo();
        //page 2
        accInfoPage.VerifyEmail();
    }
}
