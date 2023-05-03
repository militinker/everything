package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // open fb.com
        driver.get("https://www.facebook.com/");
        //send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");
        // SEND IN THE password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        // click on a button create new button
        driver.findElement(By.linkText("Create new account")).click();

        // click on forgoton password
        driver.findElement(By.partialLinkText("password?")).click();
        // close the browser
        driver.quit();
    }
}
