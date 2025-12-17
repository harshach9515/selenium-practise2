import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderTest {

    @Test
    public void orderTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");

        PageElement2 pageElements = new PageElement2();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement email=driver.findElement(By.xpath(pageElements.emailUserXpath));
        email.sendKeys("vsreddy1234@gmail.com");

        WebElement password=driver.findElement(By.xpath(pageElements.passwordxapth));
        password.sendKeys("Vamsi@123");

        WebElement loginButton=driver.findElement(By.xpath(pageElements.loginButtonXpath));
        loginButton.click();

        wait.until(ExpectedConditions.urlContains("dashboard"));
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("dashboard")){
            System.out.println("Login Successful, navigated to dashboard");
        }
        else {
            System.out.println("Login Failed");
            driver.quit();
        }

        //next Steps for placing an order would go here
        Thread.sleep(2000);
        String productName= driver.findElement(By.xpath("//b[text()='ZARA COAT 3']")).getText();

        WebElement addToCartButton = driver.findElement(By.xpath(pageElements.productAddToCartButton));
        addToCartButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageElements.cartButton)));
        Thread.sleep(2000);
        WebElement cartButton = driver.findElement(By.xpath(pageElements.cartButton));
        cartButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pageElements.productName)));
        String cartProductName = driver.findElement(By.cssSelector(pageElements.productName)).getText();

        if(productName.equalsIgnoreCase(cartProductName)){
            System.out.println("Product successfully added to cart: " + cartProductName);
        } else {
            System.out.println("Product not found in cart");
            driver.quit();
        }
        driver.quit();

    }
}
