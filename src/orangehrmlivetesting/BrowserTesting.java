package orangehrmlivetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserTesting
{
    public static void main(String[] args) {
        String baseurl = " https://opensource-demo.orangehrmlive.com/";
        //setup the chrome browser
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get(baseurl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current url

        System.out.println("Current url :" + driver.getCurrentUrl());

        //print the page source
        System.out.println("Page Source :" + driver.getPageSource());

        //enter username to username field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("jaiminI123");

        //enter the password to password field
        driver.findElement(By.name("password")).sendKeys("awr12");

        //close the browser
        driver.close();
    }

}
