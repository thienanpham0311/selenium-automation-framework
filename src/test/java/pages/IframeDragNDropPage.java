package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class IframeDragNDropPage extends BasePage {

    public IframeDragNDropPage(WebDriver driver) {
        super(driver);
    }
    private By iframe = By.cssSelector("iframe.demo-frame");

    private By source =
            By.id("draggable");

    private By target =
            By.id("droppable");
    public void switchFrame()
    {
        switchToFrame(iframe);
    }
    public void dragDrop()
    {
        Actions actions =
                new Actions(driver);

        actions.dragAndDrop(
                find(source),
                find(target)
        ).perform();
    }
    public String getDropText()
    {
        return getText(target);
    }
    public void verifyDropped()
    {
        String actualText =
                getDropText();

        System.out.println(actualText);

        if(actualText.equals("Dropped!"))
        {
            System.out.println(
                    "Test Passed"
            );
        }
        else
        {
            System.out.println(
                    "Test Failed"
            );
        }
    }
}
