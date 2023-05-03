package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;


public class ExplicitWaitDemo {
    private static Label text;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='startButton']")).click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies'")));
// once the element is visible then get the text

        driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies'"));
       String WelcomeText= text.getText();
        System.out.println(WelcomeText);
    }
}
