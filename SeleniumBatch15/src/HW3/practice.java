package HW3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
       WebElement src= driver.findElement(By.id("empsearch_employee_status"));
       src.click();
        Select select=new Select(src);
        select.selectByValue("418");

        driver.findElement(By.id("resetBtn")).click();

        driver.findElement(By.linkText("51852A")).click();

        TakesScreenshot ss=(TakesScreenshot) driver;
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("C:\\Users\\demay\\IdeaProjects\\SeleniumBatch15\\src\\scren\\mmm.png"));

        driver.close();


    }
}
