package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        //get title
       String title= driver.getTitle();

       // verify if title is correct you can print it first and will get "Web Orders"
        if(title.equals("Web Orders")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }
        // logout
        driver.findElement(By.linkText("Logout")).click();

        driver.quit();
    }
}
