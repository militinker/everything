package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();
        WebElement calendar=driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

      WebElement month= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

      WebElement nextBtn= driver.findElement(By.xpath("//span[text()='Next']"));
      // click on next button till you find right month
        boolean isFound=false;
        while(!isFound){
            String month_=month.getText();
            if(month_.equalsIgnoreCase("August")){
                // select the date
            List<WebElement> days= driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String day_text=day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }else {
                nextBtn.click();
            }

        }


    }
}
