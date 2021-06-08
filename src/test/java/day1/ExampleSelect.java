package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleSelect {
    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://www.html-code-generator.com/html/drop-down/country-names" );
        Select se = new Select ( driver.findElement ( By.id ("condi")) );
        se.selectByIndex ( 2 );
        se.deselectAll ();
    }
}
