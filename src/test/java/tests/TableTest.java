package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablePage;

public class TableTest extends BaseTest
{
    @Test
    public void TableTestFlow() throws InterruptedException
    {
        TablePage tablePage = new TablePage(driver);
        driver.get("https://the-internet.herokuapp.com/tables");
        tablePage.printAllRows();
        Assert.assertEquals(
                tablePage.getRowCount(),
                4
        );
        Assert.assertTrue(
                tablePage.isEmailExist(
                        "jsmith@gmail.com"
                )
        );
    }
}