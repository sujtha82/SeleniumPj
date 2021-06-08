package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {
    WebDriver driver;
    public static void launchChrome() throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver" ,"C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver= new ChromeDriver ();//need to create object for particular class
          //with varible name get the methods
          //  driver.get("https://www.facebook.com/");
           //driver.navigate().to("https://www.javatpoint.com/");//navigate is interface
            driver.navigate ().to(" http://automationpractice.com/index.php");

             driver.findElement(By.id ( "search_query_top")).sendKeys ( "women" );
             driver.findElements ( By.xpath ( "/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button" ) );
             // driver.navigate ().refresh ();

               Thread.sleep(10000 );
               driver.navigate ().back ();
              // driver.navigate().to("https://www.javatpoint.com/");//navigate is interface
                 driver.navigate ().forward ();
             //Thread.sleep(5000 );

               driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
       BasicCommands bc=new BasicCommands ();//if non static use
        bc.launchChrome();
        //launchChrome();


    }



}
