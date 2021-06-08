package com.wbl.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverEx {
    WebDriver driver;
    public void launchChrome() throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver" ,"C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        driver=new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait(60 , TimeUnit.SECONDS);
        driver.navigate ().to("https://www.walmart.com/grocery/");
        //driver.manage ().timeouts ().implicitlyWait(60 , TimeUnit.SECONDS);
      //  WebElement logo= driver.findElement ( By.id ("*[skipHeaderLink"));
        WebElement logo=driver.findElement (By.xpath (" //*[@id=/'searchForm'input "));
        logo.sendKeys ( "hand" );
       // driver.findElement(By.xpath ( "" ) );
        List<WebElement> list = driver.findElements ( By.cssSelector ( "ul.FeaturedTopNav-nav-list li" ));//"ul.slider-list li"

       // driver.wait (500);
        for(WebElement ele:list){
         //   System.out.println (ele.getText());//it get text of particular elememts
        }
      //  if()
        //driver.wait (500);
       // driver.close();
       // driver.quit ();
       // driver.navigate ().to ( "https://www.javatpoint.com/selenium-tutorial" );
      // WebElement logo= driver.findElement ( By.id ("*[skipHeaderLink"));
               //div#smoothmenu1);
      // List<WebElement> List=driver.findElements ( By.xpath ( "" ) );
       //
       // driver.findElement (By.cssSelector ( "div#smoothmenu1"  ) );
        //logo.click ();

       // public static void main(String[] args) throws InterruptedException {
         //   WebDriverEx webDriverEx= new WebDriverEx ();
           // webDriverEx.launchChrome ();



        }
    }
