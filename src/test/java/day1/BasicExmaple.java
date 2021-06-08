package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicExmaple {
    WebDriver driver;

    public void launchChrome() throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver =new ChromeDriver ();
        //driver= new Webdriver ();
        driver.navigate().to ("http://automationpractice.com/index.php"  );
        driver.manage ().window ().maximize ();
         driver.manage ().timeouts ().implicitlyWait ( 50,TimeUnit.SECONDS );
        driver.findElement ( By.id ( "search_query_top" ) ).sendKeys ( "DRESSES" );
         Thread.sleep ( 5000 );
        driver.findElement( By.name ( "submit_search")).click ();
        Thread.sleep ( 5000 );
        driver.findElement ( By.partialLinkText("Printed chiffon knee length dress ") ).click ();
        driver.quit ();
        driver.close ();
}
    public static void main(String[] args) throws InterruptedException {
        BasicExmaple bc=new BasicExmaple ();
        bc.launchChrome ();
    }
}
