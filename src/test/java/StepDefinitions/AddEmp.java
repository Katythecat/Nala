package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;

public class AddEmp extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        doClick(addEmployee.pimTab);

    }
    @When("user click on Add employee button")
    public void user_click_on_add_employee_button() {
        doClick(addEmployee.addEmpBtn);

    }
    @When("user enters firstname and middle and lastname")
    public void user_enters_firstname_and_middle_and_lastname() {
        sendText(addEmployee.firstnameTextBox,ConfigReader.getValueOfProperty("firstname"));
        sendText(addEmployee.middlenameTextBox,ConfigReader.getValueOfProperty("middlename"));
        sendText(addEmployee.lastnameTextBox,ConfigReader.getValueOfProperty("lastname"));


    }
    @When("user click on save button")
    public void user_click_on_save_button() {
        doClick(addEmployee.saveBtn);

    }







}
