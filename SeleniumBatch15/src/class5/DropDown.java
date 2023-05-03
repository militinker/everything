package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //locate the web element
       WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
       // declare object of select class
        Select sel=new Select(dropDown);
        //using select class we have different methods to select desired options
        // select by index
        sel.selectByIndex(2); // it will click and select ir
        // select by value
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");
        // select by visible text
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");





    }
}
