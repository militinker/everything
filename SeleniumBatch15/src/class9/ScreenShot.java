package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        // take screenshot theres interface
        TakesScreenshot ss=(TakesScreenshot) driver; // declaring it
        // take the screenshot as file
       File sourceFile= ss.getScreenshotAs(OutputType.FILE);
       // System.out.println(sourceFile);
       // save the file in computer
        FileUtils.copyFile(sourceFile,new File("C:\\Users\\demay\\IdeaProjects\\SeleniumBatch15\\src\\scren\\abc.png")); // had to create new file where to save



    }
}
