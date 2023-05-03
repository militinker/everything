package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        //click on the button for simple promp alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //use switch to
       Alert alert= driver.switchTo().alert();
       Thread.sleep(2000);
       alert.accept();

       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
       alert.dismiss();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        alert.sendKeys("abracadabra");
        Thread.sleep(2000);

        alert.accept();

    }
}
