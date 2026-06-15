package data;
import org.testng.annotations.DataProvider;
public class ProfileDataProvider {
    @DataProvider(name = "locations")
    public Object[][] locations() {

        return new Object[][]{
                {"Da Lat"},
                {"Ho Chi Minh"},
                {"Ha Noi"}
        };
    }
}
