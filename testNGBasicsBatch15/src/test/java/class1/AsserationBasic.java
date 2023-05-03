package class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AsserationBasic {

    public static WebDriver driver; // have to declare it here to be able to use it in entire class
    @BeforeMethod
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
// after going to the website enter username and password
    // click login button
    // verify that msg invalid credentials is displayed

    @Test
    public void invalidCredentials(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));
        password.sendKeys("abracadabra");
        driver.findElement(By.xpath("//input[@type='submit']")).click(); // if u put* instead of input it means anytag
        WebElement invalidCred = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        // verify the text of error msg
       String error= invalidCred.getText();
       String expectedError="Invalid credentials";
        Assert.assertEquals(expectedError,error);

            System.out.println(invalidCred.isDisplayed());
        password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));

            //verify that password textbox is displayed
        boolean pass=password.isDisplayed();
        Assert.assertTrue(pass);
        }




}
