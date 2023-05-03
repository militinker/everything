package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexcetutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

        //highligt
        //1. declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //2. execute script == script is just a code in javascript
        // get this code from google
        // arguments[0].style.border='10px dotted pink' draw a box
        js.executeScript("arguments[0].style.border='10px dotted pink'", username);// whatever u need to do put in the ()
        // it can also be solid blue or dotted blue = all this find on google
        //click the login button
        //find the web element
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        js.executeScript("argument[0].click();",loginBtn);
        //scroll up or down




    }
}
