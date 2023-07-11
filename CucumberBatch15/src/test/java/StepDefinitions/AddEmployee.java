package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.DBUtility;
import Utils.GlobalVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.logging.SocketHandler;

public class AddEmployee extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {

     //WebElement pimTab =driver.findElement(By.id("menu_pim_viewPimModule"));
     doClick(addEmp.pimTab);

    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {

        //WebElement addBtn=driver.findElement(By.id("menu_pim_addEmployee"));
        doClick(addEmp.addBtn);

    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {

       // driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstName"));
      //  WebElement firstName=driver.findElement(By.id("firstName"));
        sendText(addEmp.firstName,ConfigReader.getPropertyValue("firstName"));

       // driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middleName"));
      //  WebElement middleName=driver.findElement(By.id("middleName"));
        sendText(addEmp.middleName,ConfigReader.getPropertyValue("middleName"));

       // driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastName"));
       // WebElement lastName=driver.findElement(By.id("lastName"));
        sendText(addEmp.lastName,ConfigReader.getPropertyValue("lastName"));
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {

       // WebElement saveBtn=driver.findElement(By.id("btnSave"));
        Assert.assertTrue(addEmp.saveBtn.isDisplayed());
        System.out.println("my assertion is returning true");
        doClick(addEmp.saveBtn);
    }
/////////////////////////////////////////
    // sql automation

    @Given("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String fname, String mname, String lname) {
        sendText(addEmp.firstName, fname);
        sendText(addEmp.middleName, mname);
        sendText(addEmp.lastName, lname);
    }
    @Given("user captures the employee id")
    public void user_captures_the_employee_id() {
       GlobalVariables.emp_id = addEmp.empIdLocator.getAttribute("value");
        System.out.println("the employee id is " + GlobalVariables.emp_id);
    }
    @Given("query the information in backend")
    public void query_the_information_in_backend() {
     String query = "select * from hs_hr_employees where employee_id='"+GlobalVariables.emp_id+"'";
     // to store the table from coming db, we used global variable here
        // in this variable we got all the jeys and values for the emplouee we searcedh
       GlobalVariables.tabledata= DBUtility.getListOfMapsFromRset(query);
    }
    @Then("verify the results from frontend and backend")
    public void verify_the_results_from_frontend_and_backend() {
    // can not use else if conditions in automation as it is prohibited
        // so we have to use assertions for conditions whithin cucumber framework
        // we are working with junit assertions

        // now from all these values we need to compare one by one value
       String firstNameFromDb= GlobalVariables.tabledata.get(0).get("emp_firstname");
        System.out.println(firstNameFromDb);
        String lastNameFromDb= GlobalVariables.tabledata.get(0).get("emp_lastname");
        System.out.println(lastNameFromDb);

        //adding assertion / comparison
        Assert.assertEquals(firstNameFromDb,"nesha");
        Assert.assertEquals(lastNameFromDb,"standart");

        System.out.println("my assertion has passed my test");

    }

}
