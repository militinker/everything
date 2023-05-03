package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        // task is get the whole table accesed and print it on the console
        // access level 1 = table based access
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data=table.getText();
       // System.out.println(table_data);

        //get the row that contains google
        //row level acces
        //get the rows of the table and print them

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row:rows){
            //extraxt text from each row
            String row_text=row.getText();

            //print row that contains google
            if(row_text.contains("Google")){
                System.out.println(row_text);
            }
        }

        // task 3: column level access

        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
       for(WebElement column:columns){
           String col=column.getText();
           // print all text
           System.out.println(col);
       }
           // task 4 just print the first column of every row

        List<WebElement> column1=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
      for(WebElement col1:column1){
          String collumn=col1.getText();
          System.out.println(collumn);
      }


    }
}
