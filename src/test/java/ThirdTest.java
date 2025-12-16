import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ThirdTest {
    @Test
    public void productTest() {
        WebDriver driver = new ChromeDriver();

        System.out.println("Login to Rahulshetty Academy");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement signInBtn = driver.findElement(By.id("signInBtn"));

        System.out.println("Enter Username And Password");
        username.sendKeys("rahulshettyacademy");
        password.sendKeys("learning");
        signInBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[text()='iphone X']")).click();
        String title=driver.getTitle();
        System.out.println(title);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement name=driver.findElement(By.xpath("(//input[@name=\"name\"])[1]"));
        name.sendKeys("vamsi");
        System.out.println("vamsi");

        WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
        email.sendKeys("vamsi123@gmail.com");
        System.out.println("vamsi123@gmail.com");

        WebElement pasword=driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]"));
        pasword.sendKeys("password123");
        System.out.println("password123");

        driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).click();
        driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"inlineRadio1\"]")).click();

        WebElement dates=driver.findElement(By.xpath("//input[@name=\"bday\"]"));
        dates.sendKeys("12082000");
        driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String successMessage = driver.findElement(By.xpath("//strong[text()='Success']")).getText();
        System.out.println(successMessage);
        driver.quit();
    }
}
