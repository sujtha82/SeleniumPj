package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleAlert {
    public static void main(String [] args){
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "http://demo.guru99.com/test/delete_customer.php" );
        driver.findElement ( By.xpath ("/html/body/form/table/tbody/tr[2]/td[2]/input") ).sendKeys ( "hjj" );
        driver.findElement ( By.name ( "submit" ) ).submit ();
        Alert Alert=driver.switchTo ().alert ();
        Alert.accept ();
    }

}
