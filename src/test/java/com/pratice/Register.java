package com.pratice;

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
        PageElement2 pageElements=new PageElement2();
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/client/#/auth/register");

        WebElement firstName=driver.findElement(By.id(pageElements.firstNameXPath));
        firstName.sendKeys("vamsi");

        WebElement lastName=driver.findElement(By.id(pageElements.lastNameXpath));
        lastName.sendKeys("reddy");

        WebElement email=driver.findElement(By.id(pageElements.emailUserXpath));
        email.sendKeys("vsreddy1234@gmail.com");

        WebElement phoneNumber=driver.findElement(By.id("userMobile"));
        phoneNumber.sendKeys("9876543210");


        WebElement occupation = driver.findElement(By.xpath(pageElements.occDropdownXpath));
        System.out.println(occupation);

        Select selectOccupation=new Select(occupation);
        selectOccupation.selectByVisibleText("Student");

        WebElement male= driver.findElement(By.xpath("//input[@value='Male']"));
        male.click();

        WebElement password=driver.findElement(By.id("userPassword"));
        password.sendKeys("Vamsi@123");

        WebElement conformPassword=driver.findElement(By.id("confirmPassword"));
        conformPassword.sendKeys("Vamsi@123");

        WebElement age=driver.findElement(By.xpath("//input[@type='checkbox']"));
        age.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='com.pratice.Register']")));

        WebElement register=driver.findElement(By.xpath("//input[@value='com.pratice.Register']"));
        register.click();
        driver.quit();
    }
}
