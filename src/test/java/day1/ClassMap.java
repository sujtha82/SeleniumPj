package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ClassMap {

    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ("https://www.facebook.com/");
        Actions ac = new Actions(driver );
        WebElement userName=driver.findElement ( By.xpath ( "//*[@id=\'email']" ) );
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS);
        Action Home = ac.moveToElement( userName).click ().keyDown ( userName, Keys.SHIFT ).sendKeys (userName,"sujatha"  )
                .keyUp (userName, Keys.SHIFT).doubleClick (userName).contextClick ().build ();
         Home.perform();
         driver.close ();


        }
    }

