package flows;
import pages.HDHomePage;

public class LoginFlowHD{


        private HDHomePage homePage;


        public LoginFlowHD(
                HDHomePage homePage
        )
        {

            this.homePage = homePage;
        }

        public void login(
                String username,
                String password
        ) {

            homePage.clickLogin();

            homePage.enterUsername(username);

            homePage.enterPassword(password);

            homePage.clickDn();

        }
}
