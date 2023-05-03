package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/%22");
        driver.manage().window().maximize();

        //implicitwait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");

        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");

        // explicit wait when theres enable-disable button
        driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
    }
}
