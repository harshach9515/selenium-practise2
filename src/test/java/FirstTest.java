import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    @Test
    public void testOne() throws InterruptedException {

        System.out.println("Launch Chrome browser");
        WebDriver driver = new ChromeDriver();

        System.out.println("Navigate to Rahulsheety Academy login page");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        System.out.println("Login to Rahulsheety Academy");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement signInButton = driver.findElement(By.id("signInBtn"));

        System.out.println("Enter username and password");
        username.sendKeys("rahulshettyacademy");
        password.sendKeys("learning");

        System.out.println("Click on Sign In button");
        signInButton.click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL after login: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("shop"), "Login failed or did not navigate to dashboard");
        driver.close();
    }
}
