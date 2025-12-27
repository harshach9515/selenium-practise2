package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderTest {

    @Test
    public void orderTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");

        PageElement2 pageElements = new PageElement2();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement email = driver.findElement(By.xpath(pageElements.emailUserXpath));
        email.sendKeys("vsreddy1234@gmail.com");

        WebElement password = driver.findElement(By.xpath(pageElements.passwordXpath));
        password.sendKeys("Vamsi@123");

        WebElement loginButton = driver.findElement(By.xpath(pageElements.loginButtonXpath));
        loginButton.click();

        wait.until(ExpectedConditions.urlContains("dashboard"));
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("dashboard")) {
            System.out.println("Login Successful, navigated to dashboard");
        } else {
            System.out.println("Login Failed");
            driver.quit();
        }

        //next Steps for placing an order would go here
        Thread.sleep(2000);
        String productName = driver.findElement(By.xpath("//b[text()='ZARA COAT 3']")).getText();

        WebElement addToCartButton = driver.findElement(By.xpath(pageElements.productAddToCartButton));
        addToCartButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageElements.cartButton)));
        Thread.sleep(2000);
        WebElement cartButton = driver.findElement(By.xpath(pageElements.cartButton));
        cartButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pageElements.productName)));
        String cartProductName = driver.findElement(By.cssSelector(pageElements.productName)).getText();

        if (productName.equalsIgnoreCase(cartProductName)) {
            System.out.println("Product successfully added to cart: " + cartProductName);
        } else {
            System.out.println("Product not found in cart");
            driver.quit();
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageElements.productPrice)));
        String productPrice = driver.findElement(By.xpath(pageElements.productPrice)).getText();

        WebElement buyButton = driver.findElement(By.xpath(pageElements.checkButton));
        buyButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);

        WebElement cardNumber = driver.findElement(By.xpath(pageElements.cardNumber));
        cardNumber.clear();
        cardNumber.sendKeys("0000000000000000");

        WebElement expiryMonth = driver.findElement(By.xpath(pageElements.expiryMonth));
        System.out.println(expiryMonth);
        Select SelectElement = new Select(expiryMonth);
        SelectElement.selectByIndex(10);

        WebElement expiryDate = driver.findElement(By.xpath(pageElements.expiryDate));
        Select SelectElements = new Select(expiryDate);
        SelectElements.selectByIndex(15);


        WebElement cvvNumber = driver.findElement(By.xpath(pageElements.cvvNumber));
        cvvNumber.sendKeys("000");

        WebElement cardName = driver.findElement(By.xpath(pageElements.cardName));
        cardName.sendKeys("vamsi");

        WebElement emailAddress = driver.findElement(By.xpath(pageElements.emailAddress));
        emailAddress.clear();
        emailAddress.sendKeys("vsreddy1234@gmail.com");

        WebElement countryName = driver.findElement(By.xpath(pageElements.countryName));
        countryName.sendKeys("India");
        WebElement selectIndia = driver.findElement(By.xpath(pageElements.selectIndia));
        selectIndia.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        WebElement placeOrderButton = driver.findElement(By.xpath(pageElements.placeOrderButton));
        action.moveToElement(placeOrderButton).click().perform();
        //placeOrderButton.click();

        String successMessage = driver.findElement(By.xpath(pageElements.successFullMsg)).getText();
        System.out.println(successMessage);
        if (successMessage.equalsIgnoreCase("Thankyou for the order.")) {
            System.out.println("order placed successFully");
        } else
        {
        System.out.println("order does not placed successfully");
    }
        String orderId=driver.findElement(By.xpath(pageElements.orderId)).getText();

        String text=orderId.replace("|","").trim();
        WebElement clickHistory=driver.findElement(By.xpath(pageElements.clickHistory));
        clickHistory.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String orderId2=driver.findElement(By.xpath(pageElements.orderId2)).getText();
        if (text.equalsIgnoreCase(orderId2)){
            System.out.println("Order id is correct");
        }
        else {
            System.out.println("Order id is wrong");
        }
        WebElement viewButton=driver.findElement(By.xpath(pageElements.viewButton));
        viewButton.click();
        String orderSummmary=driver.findElement(By.xpath(pageElements.orderSummary)).getText();
        System.out.println(orderSummmary);
        if (orderSummmary.equalsIgnoreCase("order summary")){
            System.out.println("Order Summary is Conformed");
        }
        else {
            System.out.println("Order Summary is not Conformed");
        }




        driver.quit();

    }
}
