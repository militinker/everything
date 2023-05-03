package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class fileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
                 driver.manage().window().maximize();
WebElement uploadbtn=driver.findElement(By.xpath("//input[@id='file-upload']"));

        uploadbtn.sendKeys("C:\\Users\\demay\\Desktop\\profile pic.PNG");
        WebElement uploadBtn= driver.findElement(By.xpath("//input[@id='file-submit']"));
        uploadbtn.click();

    }
}
