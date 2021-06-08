package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
       //Webdriver driver;
    public void launchChrome() throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
       WebDriver driver =new ChromeDriver ();
        //driver= new Webdriver ();
        driver.navigate().to ( "https://www.orangehrm.com/" );
        driver.manage ().window ().maximize ();
        Thread.sleep ( 500 );
        driver.findElement( By.id ( "Form_submitRequest_FirstName" )  ).click ();
        driver.quit ();;
    }
        public static void main(String[] args) throws InterruptedException {
            Example bc=new Example ();
            bc.launchChrome ();


        }
    }

