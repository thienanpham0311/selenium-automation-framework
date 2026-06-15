package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;

public class HDAccInfoPage extends BasePage {

    public HDAccInfoPage(WebDriver driver) {
        super(driver);
    }

    private By emailValue = By.xpath("//dd[contains(.,'jiroupham@gmail.com')]");
    private By change = By.xpath("//a[contains(@href, '/account/username')]//span[contains(text(), 'Thay đổi')]");
    private By locationTextBox = By.xpath("//input[contains(@name, 'profile[location]')]");
    private By saveBtn = By.xpath("(//button[@type='submit' and contains(.,'Lưu')])[last()]");

    public String getEmail() {
        return getText(emailValue);
    }

    public void VerifyEmail()
    /*{
        if(getemail().contains('jiroupham@gmail.com'))
        {
            System.out.println("email correct");
        }
        else
        {
            System.out.println("email incorrect");
        }
    }*/
    {
        Assert.assertTrue(
                getEmail().contains("jiroupham@gmail.com"),
                "Email is incorrect"
        );
    }
    public void changeLocation(String location)
    {
        type(locationTextBox, location);
    }
    public void clickSave()
    {
        click(saveBtn);
    }
    public String getLocation()
    {
        return getAttribute(
                locationTextBox,
                "value"
        );
    }
}