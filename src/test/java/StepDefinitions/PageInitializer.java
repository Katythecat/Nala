package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;

public class PageInitializer {

    public static LoginPage login;

    public static void initializePageObjects(){
        login=new LoginPage();

    }

}
