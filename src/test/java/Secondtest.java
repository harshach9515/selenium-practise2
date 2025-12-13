import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Secondtest {
    @Test
    public void getProductNames() {
        WebDriver driver = new ChromeDriver();

        System.out.println("Login to Rahulshetty Academy");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement signInBtn =driver.findElement(By.id("signInBtn"));

        System.out.println("Enter Username And Password");
        username.sendKeys("rahulshettyacademy");
        password.sendKeys("learning");
        signInBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> products =driver.findElements(By.cssSelector("div.card-body h4.card-title a"));

        for (WebElement product:products) {
            System.out.println(product.getText());
        }

        //Print all price of the products

        //Print All product description

        System.out.println("Closing Browser...");
        driver.quit();




    }


}
