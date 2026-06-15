package tests;
import config.ConfigReader;
import data.TestDataReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HDAccInfoPage;
import pages.HDHomePage;
import flows.LoginFlowHD;
import base.BaseTest;


public class HDAccountVerifyTest extends BaseTest{
    private HDHomePage homePage;

    private HDAccInfoPage accInfoPage;

    private LoginFlowHD loginFlow;

    @BeforeMethod
    public void loginBeforeEachTest() {

        homePage =
                new HDHomePage(driver);

        accInfoPage =
                new HDAccInfoPage(driver);

        loginFlow =
                new LoginFlowHD(homePage);

        driver.get(
                ConfigReader.getBaseUrl()
        );

        loginFlow.login(
                TestDataReader.getUsername(),
                TestDataReader.getPassword()
        );
    }
    @Test
    public void verifyHDPageReturnCorrectEmail() throws InterruptedException
    {

        homePage.clickProfile();
        homePage.clickAccInfo();
        //page 2
        accInfoPage.VerifyEmail();
    }

}
