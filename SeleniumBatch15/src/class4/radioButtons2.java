package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();


        //find all the age group radio buttons
        //the xpath here is common to all the webelements that have age group
        List<WebElement> radioBtns= driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //itereate over list to see ur desired one
        for(WebElement radioBtn:radioBtns){
         //   System.out.println(radioBtn.getAttribute("value")); // save it in variable
            String age=radioBtn.getAttribute("value");

        // if the value of the element is 5-10 click on it

        if(age.equalsIgnoreCase("5 - 15")){
            radioBtn.click();
        }
    }
    }
}
