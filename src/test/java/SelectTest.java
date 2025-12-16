import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTest {

    @Test
    public void selectTest(){

        //Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        System.out.println("Login to Rahulshetty Academy");

        //Open URL
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        //Locate Username and Password fields
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));

        //Enter Username And Password
        System.out.println("Enter Username And Password");
        username.sendKeys("rahulshettyacademy");
        password.sendKeys("learning");

        //Create object of PageElements class to access the locators
        PageElements pageElements = new PageElements();
        WebElement element = driver.findElement(By.xpath(pageElements.selectDropdownXpath));
        System.out.println(element);

        //Create object of Select class and pass the element & perform actions
        Select selectElement = new Select(element);
        selectElement.selectByVisibleText("Teacher");
        //select.selectByIndex(1);
        //select.selectByValue("teach");

        //select.deselectByVisibleText();
        //select.deselectByIndex();
        //select.deselectByValue();

        driver.quit();


    }
}
