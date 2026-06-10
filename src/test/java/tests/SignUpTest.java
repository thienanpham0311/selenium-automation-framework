package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginSignupPage;
import pages.AccountInfoPage;


public class SignUpTest extends BaseTest {

    @Test
    public void verifySignupFlow() throws InterruptedException{

        // ================= PAGE 1 =================

        LoginSignupPage loginSignupPage =
                new LoginSignupPage(driver);

        loginSignupPage.enterSignupName("An Pham");

        loginSignupPage.enterSignupEmail("thienanpham0311@gmail.com");

        loginSignupPage.clickSignupButton();
        Thread.sleep(3000);

        // ================= PAGE 2 =================

        AccountInfoPage accountInfoPage =
                new AccountInfoPage(driver);

        // Verify carried data


            Assert.assertEquals(accountInfoPage.getName(), "An Pham");

            Assert.assertEquals(accountInfoPage.getEmail(), "thienanpham0311@gmail.com");
        // Verify default radio state

        Assert.assertFalse(
                accountInfoPage.isMaleSelected());

        Assert.assertFalse(
                accountInfoPage.isFemaleSelected());

        // Select male

        accountInfoPage.selectMale();

        // Verify radio state

        Assert.assertTrue(
                accountInfoPage.isMaleSelected());

        Assert.assertFalse(
                accountInfoPage.isFemaleSelected());
        //select dob
        accountInfoPage.selectDay("3");

        accountInfoPage.selectMonth("November");

        accountInfoPage.selectYear("1993");
    }

}
