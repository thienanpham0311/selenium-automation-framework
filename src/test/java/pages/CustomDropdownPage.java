package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import base.BasePage;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class CustomDropdownPage extends BasePage {
    public CustomDropdownPage(WebDriver driver) {
        super(driver);
    }
    //locator
    private By dropdown = By.id("speed-button");
    private By fastOption = By.xpath("//li[contains(.,'Fast')]");
    private By frame = By.cssSelector("iframe.demo-frame");
    public void clickDropdown()
    {
        click(dropdown);
    }
    public void selectFast()
    {
        click(fastOption);
    }
    public String getSelectedValue()
    {
        return getText(dropdown);
    }
    public void verifySelectedValue()
    {
        String actualValue =
                getSelectedValue();

        System.out.println(actualValue);

        if(actualValue.contains("Fast"))
        {
            System.out.println(
                    "Dropdown Test Passed"
            );
        }
        else
        {
            System.out.println(
                    "Dropdown Test Failed"
            );
        }
    }
    public void selectFrame()
    {
        driver.switchTo().frame(find(frame));
    }
}