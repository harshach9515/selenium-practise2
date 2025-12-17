import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Register {
    @Test
    public void RegisterPage()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/#/auth/register");

        WebElement firstname=driver.findElement(By.id("firstName"));
        firstname.sendKeys("vamsi");

        WebElement lastname=driver.findElement(By.id("lastName"));
        lastname.sendKeys("reddy");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("vsreddy1234@gmail.com");

        WebElement phonenumber=driver.findElement(By.id("userMobile"));
        phonenumber.sendKeys("9876543210");

        PageElement2 drop=new PageElement2();
        //WebElement occupation=driver.findElement(By.id("//select[@formcontrolname='occupation']"));
        WebElement occupation = driver.findElement(By.xpath(drop.occDropdownxpath));
        System.out.println(occupation);

        Select occup=new Select(occupation);
        occup.selectByVisibleText("Student");

       WebElement male= driver.findElement(By.xpath("//input[@value='Male']"));
       male.click();

        WebElement password=driver.findElement(By.id("userPassword"));
        password.sendKeys("Vamsi@123");

        WebElement conformpassword=driver.findElement(By.id("confirmPassword"));
        conformpassword.sendKeys("Vamsi@123");

        WebElement age=driver.findElement(By.xpath("//input[@type='checkbox']"));
        age.click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //WebElement register=driver.findElement(By.id("login"));
        //WebElement register=driver.findElement(By.id("Register"));
        //register.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement register = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//input[@value='Register']")
                )
        );
        driver.quit();
    }
}
