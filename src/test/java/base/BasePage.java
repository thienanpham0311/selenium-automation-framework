package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage{
    protected WebDriver driver;
    //BasePage giu driver chung
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;// nhận driver từ bên ngoài(LoginSignupPage,AccountInfo...) đưa vào
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    //action click dung chung trong cac pages
    public void click(By locator)
    {
        driver.findElement(locator).click();
    }
    //action type vao field dung chung trong cac pages
    public void type(By locator, String text)
    {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    //action get text dung chung trong cac pages
    public String getText(By locator)
    {
        return driver.findElement(locator).getText();
    }
    //action tim element theo locator roi tra cai element do ra
    public WebElement find(By locator) {
        return driver.findElement(locator);
    }
    public String getAttribute(By locator, String attribute)
    {
        return driver.findElement(locator)
                .getAttribute(attribute);
    }
    //action hover
    public void hover(By locator)
    {
        Actions actions =
                new Actions(driver);

        actions.moveToElement(
                find(locator)
        ).perform();
    }
    public void switchToFrame(By locator)
    {
        driver.switchTo()
                .frame(find(locator));
    }

    public void switchToDefault()
    {
        driver.switchTo()
                .defaultContent();
    }
    public void waitForVisible(By locator) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    public void waitForClickable(By locator) {

        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public void waitForInvisible(By locator) {

        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(locator)
        );
    }
}
// team update