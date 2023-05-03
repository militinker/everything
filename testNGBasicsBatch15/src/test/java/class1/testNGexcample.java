package class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGexcample {
    // test1
    // go to hrms syntax
    // enter username and pasword, verify u logged in
    // close browser
   public static WebDriver driver; // have to declare it here to be able to use it in entire class
    @BeforeMethod (alwaysRun = true)
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

    @Test(groups ="regression")
    public void loginFuncionality(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@type='submit']")).click(); // if u put* instead of input it means anytag
    }

    /*
      test case 2
      verify that password text box is displayed on the login page

     */

    @Test
    public void passTextBoxVerif(){
        WebElement password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));
        System.out.println(password.isDisplayed());
    }




}
