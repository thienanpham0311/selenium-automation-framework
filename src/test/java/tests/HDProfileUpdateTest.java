package tests;
import config.ConfigReader;
import data.TestDataReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HDAccInfoPage;
import pages.HDHomePage;
import flows.LoginFlowHD;
import base.BaseTest;
import org.testng.Assert;
import data.ProfileDataProvider;


public class HDProfileUpdateTest extends BaseTest{
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
    @Test(
            dataProvider = "locations",
            dataProviderClass = ProfileDataProvider.class
    )
    public void verifyUpdateLocation(
            String location
    )
    {



        homePage.clickProfile();
        homePage.clickAccInfo();

        accInfoPage.changeLocation(location);

        Assert.assertEquals(
                accInfoPage.getLocation(),
                location
        );
        accInfoPage.clickSave();
    }
}
