package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends CommonMethods {



    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {

        sendText(login.username,ConfigReader.getValueOfProperty("username"));
        sendText(login.password,ConfigReader.getValueOfProperty("password"));
    }
    @When("click on Login Button")
    public void click_on_login_button() {

        doClick(login.loginBtn);
    }

    @Then("use logged in successfully")
    public void use_logged_in_successfully() {
        System.out.println("user logged in");
        System.out.println("test");

    }




}
