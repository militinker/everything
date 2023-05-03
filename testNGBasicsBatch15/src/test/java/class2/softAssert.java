package class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;
// go to syntaxhrm
// send no credentials and click on login buttons
// verify the error messade is username can not be empty
public class softAssert {
    public static WebDriver driver;
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

    @Test
    public void invalidCredentials(){

        driver.findElement(By.xpath("//input[@type='submit']")).click(); // if u put* instead of input it means anytag
        WebElement error = driver.findElement(By.xpath("//span[@text='Username cannot be empty']"));


        // verify the text of error msg
        String actualError= error.getText();
        String expectedError="Username cannot be empty";

        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actualError,expectedError);

        boolean isDisplayed=error.isDisplayed();
        soft.assertTrue(isDisplayed);
        soft.assertAll();



    }

}
