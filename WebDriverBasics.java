package SeleniumWebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehab\\IdeaProjects\\browser\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("nehabrahmbhatt5@yahoo.co.uk");

        driver.findElement(By.id("Password")).sendKeys("Abcd1234");

        driver.findElement(By.className("login-button")).submit();







    }







    }

