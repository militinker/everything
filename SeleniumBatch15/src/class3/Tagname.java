package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tagname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        // get all the links
        // all links are in tag <a> which is also used anchor tag
        // lets use the locator by tagName for this purpose
       List<WebElement> tags=  driver.findElements(By.tagName("a"));

       // in order to print tags(which is list) we need to iterate throu it
        for(WebElement tag:tags){
          String link=  tag.getAttribute("href");
            System.out.println(link);
        }


    }
}
