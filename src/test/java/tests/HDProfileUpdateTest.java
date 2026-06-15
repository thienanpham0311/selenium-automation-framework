package tests;
import config.ConfigReader;
import data.TestDataReader;
import org.testng.annotations.Test;
import pages.HDAccInfoPage;
import pages.HDHomePage;
import flows.LoginFlowHD;
import base.BaseTest;
import org.testng.Assert;
import data.ProfileDataProvider;


public class HDProfileUpdateTest extends BaseTest{
    @Test(
            dataProvider = "locations",
            dataProviderClass = ProfileDataProvider.class
    )
    public void verifyUpdateLocation(
            String location
    ) {

        HDHomePage homePage =
                new HDHomePage(driver);
        HDAccInfoPage accInfoPage = new HDAccInfoPage(driver);

        LoginFlowHD loginFlow =
                new LoginFlowHD(homePage);
        driver.get(
                ConfigReader.getBaseUrl()
        );

        loginFlow.login(
                TestDataReader.getUsername(),

                TestDataReader.getPassword()
        );

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
