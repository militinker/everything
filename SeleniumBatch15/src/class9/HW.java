package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    /*
    username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        WebElement PimBtn =  driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
        PimBtn.click();
// after the page refreshes all elements that have been found get descarted
        // thats why we have to find ID in the loop

// iterate to find desired id
       boolean idFound=false;
        while(!idFound) {
            List<WebElement> ids=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) {

                String id = ids.get(i).getText();
                if (id.equalsIgnoreCase("52396A")) {
                    System.out.println(id);
                    System.out.println("check the check box");
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']tbody/tr[8+1]/td1"));
                    checkbox.click();
                    idFound=true;
                    break;
                }
            }
// click on the next page
            if(!idFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next'"));
                nextBtn.click();
            }

        }
    }
}
