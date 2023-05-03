package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        // switch the iframe which contains the input box
        // sviwtch by index
        driver.switchTo().frame(0);
        // this statement will switch the focus to the first frame
        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("abracadabra");

        // get the text "click on the link below"
        // move the focus back to parent window
        driver.switchTo().defaultContent();
        // find the text
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("text is "+text.getText());

        //get the text in the frame
        // switch back to frame1
        //method name or id
        driver.switchTo().frame("iframe_a");

        WebElement label= driver.findElement(By.xpath("//label"));
        System.out.println("label is "+label.getText());

        // switch back to main page
        driver.switchTo().defaultContent();

        // clear whatever is written in text box
        // found the iframe by Webelement
       WebElement frame1= driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
       // switching to iframe1 by webelemnt
       driver.switchTo().frame(frame1);

       textBox.clear();



    }
}
