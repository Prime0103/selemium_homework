package orangehrmlivetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultipTesting
{
    static String browser = "Chrome";
    static String baseurl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());

        System.out.println("Current URL : " + driver.getCurrentUrl());

        System.out.println("Page Source: " + driver.getPageSource());

        //Find the username Field Element
        WebElement username = driver.findElement(By.name("username"));
        // Type the username in usernamefield element
        username.sendKeys("abcD1234");

        //type password ikn password field
        driver.findElement(By.name("password")).sendKeys("asd123");

        //close the browser
        driver.close();

    }
}
