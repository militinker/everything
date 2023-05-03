package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    public LoginPage(){ // need a constructor to initilize all the WebElements on this page
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername") // this is page factory model
   public WebElement usernameTextBox;
    //WebElement usernameTextBox =driver.findElement(By.id("txtUsername"));

    @FindBy(id="txtPassword")
    public  WebElement passwordTextBox;

 //   @FindBy(id="txtPassword")    this is how it looks when its reg vs factory model
//  public  WebElement passwordTextBox;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(id="welcome")
    public WebElement welcomeIcon;

    @FindBy(xpath = "//a[text()='Logout']")
   public WebElement logoutLink;

// Page Factory Model


}
