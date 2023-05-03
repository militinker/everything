package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // print all the enteries that have my money in the product
// 1.locator
        List<WebElement> productCol=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
       // iterere
// tell me row number of money in this list
        // tell me the row number in the table on the website
        // check the checkbox that contains money
        for (int i = 0; i < productCol.size(); i++) {
            String text=productCol.get(i).getText();
            if(text.equalsIgnoreCase("MyMoney")){
                System.out.println("money is in the list on index "+i);
                System.out.println("money is in the table on index "+(i+2));
                WebElement checkbox= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));
                checkbox.click();
            }
        }

    }
}
