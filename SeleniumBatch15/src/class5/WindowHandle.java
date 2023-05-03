package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2097020966%3A1678243038133164&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHeHbuuamdm2Sdd59UGQmfB_RdjS-eoZFyT0YSXhNvp9Y_sQyqyN8Whh3aH-mgy2ZnAFUfwt");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

// to get the window handle of where to focus is on
         String parentWindHand=driver.getWindowHandle();
         System.out.println(parentWindHand);

        // get window handles of all windows that have been opened up

       Set<String> windowHandles=driver.getWindowHandles();
       for(String wh:windowHandles){
           System.out.println(wh);
       }

       for(String wh:windowHandles){
           driver.switchTo().window(wh);
           String title=driver.getTitle();
           System.out.println(title);
           if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google"))
             break;

       }

       // to verify on which page u are
        System.out.println(driver.getTitle());
       driver.switchTo().window(parentWindHand);  // switching back to gmail
    }
}
