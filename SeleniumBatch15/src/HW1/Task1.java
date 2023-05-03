package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browse
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Mili");
        driver.findElement(By.id("customer.lastName")).sendKeys("Simic");
        driver.findElement(By.id("customer.address.street")).sendKeys("B Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("WPB");
        driver.findElement(By.id("customer.address.state")).sendKeys("FL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33401");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567878");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456");
        driver.findElement(By.id("customer.username")).sendKeys("MiliS");
        driver.findElement(By.id("customer.password")).sendKeys("LKJH");
        driver.findElement(By.id("repeatedPassword")).sendKeys("LKJH");
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);

        driver.quit();






    }
}
