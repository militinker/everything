package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        //go back
        driver.navigate().back();
        // go to facebook
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        // refresh page
        driver.navigate().refresh();

        driver.close();

    }
}
