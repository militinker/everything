package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    /*
     go to
     http://practice.syntaxtechs.net/basic-first-form-demo.php
    enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" http://practice.syntaxtechs.net/basic-first-form-demo.php\n");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-message")).sendKeys("my message");
        driver.findElement((By.xpath("//button[text()='Show Message']"))).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
       WebElement total= driver.findElement(By.xpath("//button[text()='Get Total']"));
        total.click();
        WebElement value=driver.findElement(By.id("displayvalue"));
        String value1=value.getText();
        System.out.println(value1);







    }



}
