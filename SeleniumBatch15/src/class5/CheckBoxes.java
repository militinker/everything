package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        //get all the checkboxes
       List<WebElement> checkBoxes= (List<WebElement>) driver.findElement(By.xpath("//input[@class='cb1-element']"));
        Thread.sleep(1000);
       //iterate throu the list

       for(int i=0; i<checkBoxes.size();i++){
          String value= checkBoxes.get(i).getAttribute("value");
          // check if this is the desired one
           // if yes click it
           // if not continiue to iterate

           if(value.equalsIgnoreCase("Option-2")){
               checkBoxes.get(i).click();
           }
       }
    }
}
