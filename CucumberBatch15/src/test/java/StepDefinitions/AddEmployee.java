package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        doClick(addEmp.saveBtn);
    }
}
