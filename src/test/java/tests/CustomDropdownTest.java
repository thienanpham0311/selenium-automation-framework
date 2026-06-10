package tests;
import base.BaseTest;
import config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomDropdownPage;

public class CustomDropdownTest extends BaseTest
{
    @Test
    public void CustumDropdownTestFlow() throws InterruptedException
    {
        CustomDropdownPage customDropdownPage = new CustomDropdownPage(driver);
        /*driver.switchTo().frame(
                driver.findElement(
                        By.cssSelector("iframe.demo-frame")
                )
        );*/
        //driver.get("https://jqueryui.com/selectmenu/");
        driver.get(
                ConfigReader.getBaseUrl()
                        + "/selectmenu/"
        );
        customDropdownPage.selectFrame();

        customDropdownPage.clickDropdown();

        customDropdownPage.selectFast();

        Assert.assertTrue(
                customDropdownPage
                        .getSelectedValue()
                        .contains("Fast")
        );
        customDropdownPage.verifySelectedValue();

    }
}