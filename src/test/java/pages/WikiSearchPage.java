package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WikiSearchPage extends BasePage {
    public WikiSearchPage(WebDriver driver) {
        super(driver);
    }
    //locator searchbox
    private By searchBox = By.id("searchInput");

    //nut search xpath
    private By searchBtn = By.xpath("//*[@id='searchform']//button[contains(.,'Search')]");

    public void inputSearch()
    {
        type(searchBox,
                "Selenium (software)");
    }
    //nut search dung near nhung khong chay duoc
    /*public void clickSearch()
    {
        driver.findElement(

                with(By.tagName("button"))
                        .near(find(searchBox))

        ).click();
    }*/
    public void clickSearch()
    {
        driver.findElement(searchBtn)
                .click();
    }
    //locator first heading
    private By firstHeading = By.id("firstHeading");

    //get first heading title
    public String getHeadingTitle()
    {
        return getText(firstHeading);
    }
    // get 1stheading bang attribute
    public String getHeadingByAttribute()
    {
        return find(firstHeading)
                .getAttribute("textContent");
    }
    //locator SeleniumWebdriver
    private By link = By.xpath("//*[@id=\"toc-Selenium_WebDriver\"]/a/div/span[contains(text(),'Selenium WebDriver')]");
    public void clickSWD()
    {
        click(link);
    }
    // lay title chua SWD
    public String getUrl()
    {
        return driver.getCurrentUrl();
    }
    //locator cai table
    private By table =
            By.cssSelector(
                    "table.infobox.vevent"
            );
    private By tableHeader =
            By.cssSelector(
                    "table.infobox th.infobox-above"
            );
    public void printTableHeader()
    {
        System.out.println(
                getText(tableHeader)
        );
    }
    public void printAllRows()
    {
        List<WebElement> rowList =
                driver.findElements(table);
        for(int i = 0; i < rowList.size(); i++)
        {
            WebElement row =
                    rowList.get(i);

            System.out.println(
                    row.getText()
            );
        }
    }

}
