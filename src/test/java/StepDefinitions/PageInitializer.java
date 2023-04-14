package StepDefinitions;


import Pages.AddEmployeePage;
import Pages.LoginPage;


public class PageInitializer {

    public static LoginPage login;
    public static AddEmployeePage addEmployee;


    public static void initializePageObjects(){
        login=new LoginPage();
        addEmployee=new AddEmployeePage();


    }

}
