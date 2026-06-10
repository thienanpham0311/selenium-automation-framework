package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.BasePage;


public class LoginSignupPage extends BasePage
{
    public LoginSignupPage(WebDriver driver)
    {
        super(driver);
    }
    //gan locator cai textbox + click vao
    private By signUpName = By.cssSelector("input[type='text']");
    private By signUpEmail = By.xpath("//input[@data-qa='signup-email']");
    private By btnSubmit = By.xpath("//button[contains(text(),'Signup')]");
    //dinh nghia method nhap vao cac o text, du lieu se dc truyen tu test sau
    public void enterSignupName(String name) {

        type(signUpName, name);
    }

    public void enterSignupEmail(String email) {

        type(signUpEmail, email);
    }

    public void clickSignupButton() {

        click(btnSubmit);
    }
}
