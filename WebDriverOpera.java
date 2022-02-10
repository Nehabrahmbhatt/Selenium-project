package SeleniumWebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverOpera {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "C:\\Users\\nehab\\IdeaProjects\\browser\\operadriver.exe");

        WebDriver driver = new OperaDriver();


        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals ("nopCommerce demo store")){
            System.out.println("Wrong Title");
        }else{
            System.out.println("Right Title");
        }

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("nehabrahmbhatt5@yahoo.co.uk");

        driver.findElement(By.id("Password")).sendKeys("Abcd1234");

        driver.findElement(By.className("login-button")).submit();

    }


}




