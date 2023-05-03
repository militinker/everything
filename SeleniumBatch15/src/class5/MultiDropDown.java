package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
// get the drop down
       WebElement dropdown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dropdown);
        //selecet by value
        sel.selectByValue("New Jersey");
        // select by visible text
        Thread.sleep(200);
        sel.selectByVisibleText("Ohio");
        // when it comes to multi select drop downs we can also deselect
        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");

        //to check if drop down is multiple or not
        System.out.println(sel.isMultiple());




    }
}
