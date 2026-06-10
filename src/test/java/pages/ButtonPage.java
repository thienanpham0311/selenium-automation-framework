package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.BasePage;

public class ButtonPage extends BasePage
{
    public ButtonPage(WebDriver driver)
    {
        super(driver);
    }
    //location cai button
    private By btn = By.cssSelector("#start button");
    public void clickbtn()
    {
        click(btn);
    }
    //location cai text
    private By text = By.cssSelector("#finish h4");
    public String getText()
    {
        return getText(text);
    }
}