package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.IframeDragNDropPage;

public class IframeDragNDropTest extends BaseTest{
    @Test
    public void verifyIframeFlow() throws InterruptedException{
        driver.get("https://jqueryui.com/droppable/");
        IframeDragNDropPage page =
                new IframeDragNDropPage(driver);

        page.switchFrame();

        page.dragDrop();

        page.verifyDropped();
    }
}