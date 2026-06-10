package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.BasePage;


public class AccountInfoPage extends BasePage {
    public AccountInfoPage(WebDriver driver) {
        super(driver);
    }
    //location cho cai radio
    private By genderM = By.id("id_gender1");
    private By genderF = By.id("id_gender2");
    //location cho cai email + name
    private  By filledName = By.id("name");
    private  By filledEmail = By.id("email");
    //location cho cai dropdown date of birth
    private By dayDropdown =
            By.id("days");

    private By monthDropdown =
            By.id("months");

    private By yearDropdown =
            By.id("years");

    public String getName()
    {
        return getAttribute(filledName, "value");
    }
    public String getEmail()
    {
        return getAttribute(filledEmail, "value");
    }
    //action select male
    public void selectMale()
    {
        click(genderM);
    }
    //is male selected
    public boolean isMaleSelected()
    {
        return find(genderM).isSelected();
    }

    public boolean isFemaleSelected()
    {
        return find(genderF).isSelected();
    }

    public void selectDay(String day)
    {
        Select select =
                new Select(find(dayDropdown));

        select.selectByVisibleText(day);
    }
    public void selectMonth(String month)
    {
        Select select =
                new Select(find(monthDropdown));

        select.selectByVisibleText(month);
    }
    public void selectYear(String year)
    {
        Select select =
                new Select(find(yearDropdown));

        select.selectByVisibleText(year);
    }
}
