package com.wbl.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get("https://www.amazon.com/");
        WebElement ele=driver.findElement ( By.xpath ( "//*[@id=\"twotabsearchtextbox"));
        ele.sendKeys ( "hand" );
       // WebElement ele=driver.findElement ( By.id ( "nav-global-location-popover-link" ) );
        //ele.click();//TO STORE THE SINGLE ELEMENT
        // driver.findElement ( By.id ( "nav-global-location-popover-link" ) ).click ();
        //driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value

        // Click on the search button
        //driver.findElement(By.name("btnK")).click();
    driver.close ();
    }

}


