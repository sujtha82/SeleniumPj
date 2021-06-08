package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonExample {
        WebDriver driver;
        public static void main(String[] args) {

            // declaration and instantiation of objects/variables
            System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver ();
            driver.navigate ().to ("https://www.quackit.com/html/codes/html_radio_button.cfm" );
            driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
          WebElement radio1=  driver.findElement ( By.name ( "preferred_item " ) );
          for(int i=0;i<=6;i++){
              radio1.click ();
              System.out.println("pageopens "+radio1.isSelected ());
            }
         // driver.quit ();

        }
}
