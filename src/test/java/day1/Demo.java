package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
   // WebDriver driver;
    // public static void launchbrowser() throws InterruptedException{
         public static void main(String[] args) throws InterruptedException {
             System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
              WebDriver driver=new ChromeDriver ();

        //System.out.println ("title of the website:"+title);
                driver.navigate().to ("http://whiteboxqa.com/");

       // Object navbar;
                driver.findElement(By.xpath ("//*[@id=\"navbar-collapse\"]/ul/li[5]/a")).click();
                driver.findElements ( By.cssSelector ("") );
                driver.navigate ().refresh ();

                driver.navigate ().back ();
                driver.navigate().forward ();
                String window =driver.getWindowHandle ();
       // System.out.println ("window: "+window);
                Thread.sleep (5000);



       //String currentUrl= driver.getCurrentUrl ();
       // System.out.println ("This is the current url"+ currentUrl);

      driver.close ();
             //    driver.quit ();
    }
}
