package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WikiHomePage;
import pages.WikiSearchPage;


public class PrintAllRow extends BaseTest{
    @Test

    public void verifyWikiFlow() throws InterruptedException
    {
        //Page1
        WikiHomePage wikiHomePage =
                new WikiHomePage(driver);
        driver.get("https://www.wikipedia.org/");
        Assert.assertTrue(
                wikiHomePage.getPageTitle()
                        .contains("Wikipedia"));
        wikiHomePage.clickEnglish();
        //Page2
        WikiSearchPage wikiSearchPage =
                new WikiSearchPage(driver);
        System.out.println(driver.getCurrentUrl());

        System.out.println(
                wikiSearchPage.getHeadingTitle());

        wikiSearchPage.inputSearch();

        wikiSearchPage.clickSearch();

        Assert.assertEquals(wikiSearchPage.getHeadingTitle(),"Selenium (software)");
        // compare 1stheading bang attribute
        Assert.assertEquals(
                wikiSearchPage.getHeadingByAttribute(),
                "Selenium (software)"
        );
        wikiSearchPage.clickSWD();
        //Xác nhận URL hoặc #firstHeading chứa “Selenium WebDriver”.
        Assert.assertTrue(
                wikiSearchPage.getUrl()
                        .contains("Selenium_WebDriver"));
        //wikiSearchPage.printTableHeader();
        wikiSearchPage.printAllRows();
    }
}
