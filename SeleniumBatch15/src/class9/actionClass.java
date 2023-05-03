package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        // moving cursor somewhere/ hovering over
      WebElement en=driver.findElement(By.xpath("//div[text()='EN']"));
        Actions action= new Actions(driver);
        action.moveToElement(en).perform();
    }
}
