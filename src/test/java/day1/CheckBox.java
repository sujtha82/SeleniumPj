package day1;

import com.wbl.webdriver.WebDriverEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBox {
    WebDriver driver;
    public void launchChrome() throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver" ,"C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        driver=new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait(60 , TimeUnit.SECONDS);
        driver.navigate ().to("https://www.demoqa.com/");
        List<WebElement> rdbt=driver.findElements ( By.xpath ("") );
}
    public static void main(String[] args) throws InterruptedException {
        CheckBox rb = new CheckBox ();
        rb.launchChrome ();
    }}
