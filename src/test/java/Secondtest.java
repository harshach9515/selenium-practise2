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
        List<WebElement> Products =driver.findElements(By.cssSelector("app-Card"));
        for (WebElement Product:Products)
        {
            String brand=Product.findElement(By.tagName("h4")).getText();
            String price=Product.findElement(By.tagName("h5")).getText();
            String descrption=Product.findElement(By.tagName("p")).getText();

            System.out.println("Brand Name;"+brand);
            System.out.println("Price   ;"+price);
            System.out.println("Descrption  ;"+descrption);

        }
        System.out.println("Closing ");
        System.out.println("");
        driver.quit();




    }


}
