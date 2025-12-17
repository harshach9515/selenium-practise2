import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
    @Test
    public void  loginTest()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("vsreddy1234@gmail.com");

        WebElement password=driver.findElement(By.id("userPassword"));
        password.sendKeys("Vamsi@123");

        WebElement loginbtn=driver.findElement(By.id("login"));
        loginbtn.click();

        driver.quit();
    }



}
