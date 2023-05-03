package HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box "click on this check box" is Selected
        if no  Select the check box
        check again if the checkbox is Selected or not
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean isSelected= checkBox.isSelected();
        if(!isSelected){
            checkBox.click();
        }
        isSelected=checkBox.isSelected();
        System.out.println(isSelected);




    }
}
