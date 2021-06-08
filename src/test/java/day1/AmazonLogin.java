package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonLogin {
    WebDriver driver;

    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://www.amazon.com/" );
        driver.manage ().window ().maximize ();
        driver.findElement (By.id ("nav-link-accountList-nav-line-1" )).click ();

      driver.findElement( new By.ByCssSelector ("#ap_email") ).sendKeys ( "sujatha.naren9@gmail.com" );

        // driver.findElement( By.name ( "password" )).click();
        driver.findElement( By.xpath ("//input[@type='submit']")).click();
        driver.findElement( By.name ( "password" )).sendKeys ("Pradhyun9"  );
        //driver.findElement( By.xpath ("")).click();
        driver.findElement(By.id("SubmitButton")).click ();
        driver.quit ();
    }
}
