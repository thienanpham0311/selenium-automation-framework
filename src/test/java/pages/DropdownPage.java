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


public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }
    //locator cai dd
    private By dropdown = By.id("dropdown");
    // method select option, lát nữa bên test truyền cái text cần chọn vào
    public void selectOption(String text)
    {
        Select select =
                new Select(
                        find(dropdown)
                );

        select.selectByVisibleText(text);
    }
    public String getSelectedOption()
    {
        Select select =
                new Select(
                        find(dropdown)
                );

        return select
                .getFirstSelectedOption()
                .getText();
    }

}