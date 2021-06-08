package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        Thread.sleep (5000);
        driver.get ( "https://www.gmail.com/" );
       driver.findElement ( By.linkText ( "Help" ) ).click ();
       Thread.sleep (5000);
       driver.quit();

                //driver.close ();
    }
}
