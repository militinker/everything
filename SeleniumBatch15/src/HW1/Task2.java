package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/%22");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("firstname")).sendKeys("Mili");
        driver.findElement(By.name("lastname")).sendKeys("Simic");
        driver.findElement(By.name("reg_email")).sendKeys("militinker@gmail.com");
        driver.findElement(By.name("reg_email_confirmation")).sendKeys("militinker@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123123");
        driver.findElement(By.id("day")).sendKeys("26");
        driver.findElement(By.id("month")).sendKeys("Sept");
        driver.findElement(By.id("year")).sendKeys("1993");
        driver.findElement(By.cssSelector("input[type='radio'][value='1']")).click();

        driver.findElement(By.className("_6j")).click();
        Thread.sleep(5000);

        driver.quit();


    }
}
