package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiHomePage extends BasePage {
    public WikiHomePage(WebDriver driver) {
        super(driver);
    }

    // locator cho cai title
    //private By title = By.cssSelector("[title='Wikipedia']");
    private By english =
            By.xpath("//strong[text()='English']");

    public String getPageTitle() {
        return driver.getTitle();
    }
    public void clickEnglish()
    {
        click(english);
    }

}
