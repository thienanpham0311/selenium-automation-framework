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


public class DynamicPage extends BasePage {
    public DynamicPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait =
            new WebDriverWait(
                    driver,
                    Duration.ofSeconds(10)
            );
    // locator checkbox
    private By checkbox = By.cssSelector("#checkbox > input[type=checkbox]");
    // remove btn
    private By removeBtn = By.xpath("//*[@id=\"checkbox-example\"]/button");
    public void clickRemoveBtn()
        {
            click(removeBtn);
        }
        public void selectCheckbox()
        {
            click(checkbox);
        }
        //message locator
    private By message = By.id("message");
    public void waitForMessage()
    {
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(message)
        );
    }
    public void verifyMessage()
    {
        String actualMessage =
                getText(message);

        System.out.println(actualMessage);

        if(actualMessage.equals("It's gone!"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
    }
    public String getMessage()
    {
        return getText(message);
    }
    //locator input
    private By input = By.cssSelector("#input-example > input[type=text]");
    //locator button
    private By btn2 = By.cssSelector("#input-example button");
    public void clickEnable()
    {
        click(btn2);
    }
    public void waitForInput()
    {
        wait.until(
                ExpectedConditions
                        .elementToBeClickable(input)
        );
    }

    public void typeText(String text)
    {
        type(input,text);
    }
    public void verifyEnable()
    {
        if(find(input).isEnabled())
        {
            System.out.println("input enabled already");
        }
        else
        {
            System.out.println("input still disabled");
        }
    }


}
