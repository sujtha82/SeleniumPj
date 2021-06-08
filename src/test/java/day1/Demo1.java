package day1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo1 {
    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://www.amazon.com/" );
        //driver.findElement(By.id("nav-search-submit-button")).sendKeys("Hand");
       // driver.manage ().timeouts ().implicitlyWait ( 20 , TimeUnit.SECONDS);
        //WebElement fr=driver.findElement ( By.id ( "nav-search-submit-button" ) );
     //   fr.click();
       // fr.sendKeys ( "Hand" );
        //Thread.sleep ( 2000 );
       // fr.sendKeys (Keys.ARROW_DOWN) ;
        //Thread.sleep ( 2000 );
       // fr.sendKeys ( Keys.ENTER );
       // driver.close ();
      //  Select select = new Select ();
        driver.manage ().timeouts ().implicitlyWait ( 10,TimeUnit.SECONDS);
       driver.findElement( By.name ( "twotabsearchtextbox" )).sendKeys ( "hand" );
       // WebElement element =
       // element.click();
        //Select select = new Select (driver.findElement ( By.xpath (  ) ))

                //select.sendKeys ( "hand" );
              //  List < WebElement > lst = driver.findElements ( By.xpath ( ".//*[contains(@id,'issDiv')]" ) ) ) instanceof ? (() (select = new Select ( driver.findElement ( By.name ( "field-keywords " ) ).sendKeys ( "hand" )

                //select.sendKeys ( "hand" );
                List < WebElement > lst = driver.findElements ( By.name ("field-keywords")) ;
        // for (WebElement webElement : lst) {
         //   System.out.println(webElement.getText());
        }
       // List<WebElement> lst = driver.findElements(By.xpath(".//*[contains(@id,'issDiv')]"));
       // for (WebElement webElement : lst) {
         //   if (webElement.getText().equalsIgnoreCase("your item to select"))
            //    webElement.click();
        }

