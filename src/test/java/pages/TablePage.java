package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.BasePage;

import java.util.List;

public class TablePage extends BasePage
{
    public TablePage(WebDriver driver) {
        super(driver);
    }
    //lay toan bo row trong bang
    private By rows = By.cssSelector("#table1 tbody tr");
    //print row ra truoc da coi co dung khong
    public void printAllRows()
    {
        List<WebElement> rowList =
                driver.findElements(rows);
        for(int i = 0; i < rowList.size(); i++)
        {
            WebElement row =
                    rowList.get(i);

            System.out.println(
                    row.getText()
            );
        }

        /*for(WebElement row : rowList)
        {
            System.out.println(
                    row.getText()
            );
        }*/
    }
    public int getRowCount()
    {
        List<WebElement> rowList =
                driver.findElements(rows);
        System.out.println(rowList.size());
        return rowList.size();

    }
    public boolean isEmailExist(String expectedEmail)
    {
        List<WebElement> rowList =
                driver.findElements(rows);

        for(int i = 0; i < rowList.size(); i++)
        {
            String actualEmail =

                    rowList.get(i)
                            .findElement(By.xpath("td[3]"))
                            .getText();

            System.out.println(actualEmail);

            if(actualEmail.equals(expectedEmail))
            {
                return true;
            }
        }

        return false;
    }
}