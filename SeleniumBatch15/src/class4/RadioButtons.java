package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        // check if radio button is eneabled
        boolean isEnabled=maleBtn.isEnabled();
        System.out.println("radio button male is enabled "+isEnabled);


        // check if radio button is displayed
        boolean isDisplayedMale= maleBtn.isDisplayed();
        System.out.println("radio button is displayed "+isDisplayedMale);

        // check if button is selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("male button is selected "+isSelectedMale);

        // if radio button is not seleced then click on it
        if(!isSelectedMale){
            maleBtn.click();
        }
        // check if button is selected

        isSelectedMale =maleBtn.isSelected();
        System.out.println("male button is selected "+isSelectedMale);

        maleBtn.click();
        Thread.sleep(1000);
    }

}
