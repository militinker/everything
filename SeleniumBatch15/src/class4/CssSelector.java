package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // open fb.com
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewBtn.click();
        // fill out first name
        //sleep
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Mili");
        // fill out last name
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("simic");


    }
}
