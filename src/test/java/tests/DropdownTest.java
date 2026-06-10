package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest extends BaseTest
{
    @Test
    public void DropdownTestFlow() throws InterruptedException
    {
        DropdownPage dropdownPage = new DropdownPage(driver);
        driver.get("https://the-internet.herokuapp.com/dropdown");
        dropdownPage.selectOption(
                "Option 1"
        );

        Assert.assertEquals(
                dropdownPage.getSelectedOption(),
                "Option 1"
        );
    }
}