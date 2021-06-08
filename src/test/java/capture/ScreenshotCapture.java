package capture;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ScreenshotCapture {
    @Test
    public void capture(){
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get ( "http://www.facebook.com" );
        driver.findElement ( By.id ( "email" ) ).sendKeys ("sujatha.naren9@gmail.com");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs ( OutputType.FILE);
        FileUtils.copyFile(source,new File("C\\Users\\BDAdmin\\com.wbl\\Selenium_sep\\june_selenium\\SeleniumProject\\src\\test\\java\\screenShot"));
        System.out.println ("screenshottaken");
        driver.quit ();
    }
}
