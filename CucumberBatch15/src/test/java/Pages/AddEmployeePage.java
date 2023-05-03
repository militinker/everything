package Pages;

import Utils.CommonMethods;
import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {

   public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "menu_pim_viewPimModule")
  public  WebElement pimTab;
   // WebElement pimTab =driver.findElement(By.id("menu_pim_viewPimModule"));

    @FindBy(id ="menu_pim_addEmployee" )
   public  WebElement addBtn;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
   public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "btnSave")
   public  WebElement saveBtn;


}
