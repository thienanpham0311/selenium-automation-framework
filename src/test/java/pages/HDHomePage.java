package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HDHomePage extends BasePage {

    public HDHomePage(WebDriver driver) {
        super(driver);
    }
    //locator btn dang nhap
    By loginBtn =
            By.cssSelector("a.p-navgroup-link--logIn");
    private By username = By.cssSelector("input[name='login']");
    private By password = By.cssSelector("input[name='password']");
    private By login = By.xpath("//button[contains(.,'Đăng nhập')]");
    private By profile = By.cssSelector("a.p-navgroup-link--user");
    private By accinfo = By.xpath("//a[contains(text(),'Chi tiết tài khoản')]");
    public void clickLogin()
    {
        waitForClickable(loginBtn);
        click(loginBtn);
        waitForVisible(username);
    }
    /*public void switchToLoginFrame() {

        driver.switchTo().frame(...);
    }*/

    public void enterUsername(String user) {

        type(username,user);
    }

    public void enterPassword(String pass) {

        type(password,pass);
    }

    public void clickDn() {
        click(login);
        waitForVisible(profile);

    }
    public void clickProfile()
    {
        waitForClickable(profile);
        click(profile);
    }
    public void clickAccInfo()
    {
     waitForClickable(accinfo);
     click(accinfo);
    }
}
