package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //instance of webdriver
        WebDriver driver=new ChromeDriver();
        // open the website google.com
        driver.get("https://www.google.com/");

        // get the current url that is there in the browser
      String URL=driver.getCurrentUrl();
        System.out.println(URL);

      //  get the title of web page
       String title= driver.getTitle();
        System.out.println("the title of the page is "+title);
        // will keep the browser open
        Thread.sleep(3000);
        // close the browser
        driver.quit();
    }
}
