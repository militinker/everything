package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        Thread.sleep(2000);

     WebElement username= (WebElement) driver.findElements(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");
        Thread.sleep(2000);

       driver.findElement(By.xpath("//input[@type='password')]")).sendKeys("test");

        // clear the username text box
      username.clear();
        Thread.sleep(2000);


        // get the text next to the username field
        WebElement usernameText= driver.findElement(By.xpath("//label[text()='Username:']"));
        usernameText.getText();
        System.out.println(usernameText.getText());
        Thread.sleep(2000);

        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText= passwordText.getText();
        System.out.println(pasText);


    }
}
