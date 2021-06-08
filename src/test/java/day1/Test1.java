package day1;

import com.sun.org.apache.xpath.internal.objects.XBooleanStatic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    WebDriver driver;
    public static void launchbrowser(){
        System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver= new ChromeDriver();
        driver.get ( "https://www.signupgenius.com/index.cfm?go=w.Welcome" );
        //driver.findElement ( By.id ( "firstname" ) ).sendKeys ( "sujathanaren9" );
       driver.findElement ( By.name ( "More" ) ).click (); ;
       // boolean status = element.isSelected();
        //boolean Status=driver.findElement ( By.name ( "lastname" ) ).isSelected ();
        System.out.println ( "yes" );


//Or can be written as


       // driver.findElement ( By.xpath ( "//*input[@id='firstNameId']" ) ).sendKeys ( "SUJATHA" );
       // driver.findElement ( By.cssSelector ( "col-sm-6 padding-left-0 padding-right-0" ).getClass ()
        //driver.get("https://www.youtube.com/channel/UC9lQxknl0xyoZ2RplirRs8A");
        //driver.get ( "http://whiteboxqa.com/login.php" );
       // driver.findElement ( By.className ("col-sm-6 padding-left-0 padding-right-0" )).sendKeys ( "akkala" );
        driver.quit ();

    }
     public static void main(String[] args) {

         Test1 bc= new Test1 ();
         bc.launchbrowser();

    }

   // private static class Chromedriver implements WebDriver {
    }


    // private static class Chromedriver implements WebDriver {



