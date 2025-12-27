package com.pratice;

public class PageElement2 {

    //email input field
    String emailUserXpath="//input[@id='userEmail']";
    String emailUserCss="input[id='userEmail']";

    //password input field
    String passwordXpath="//input[@id='userPassword']";
    String passwordCss="input[id='userPassword']";

    //login button
    String loginButtonXpath="//input[@id='login']";
    String loginButtonCss="input[id='login']";

    //register here
    //first name textField
    String firstNameXPath="//input[@id='firstName']";
    String firstNameCss="input[id='firstName']";

    //last name textField
    String lastNameXpath="//input[@id='lastName']";
    String lastNameCss="input[id='lastName']";

    //email textField
    String emailXpath="//input[@id='userEmail']";
    String emailCss="input[id='userEmail']";

    //phone number textField
    String phoneXpath="//input[@id='userMobile']";
    String phoneCss="input[id='userMobile']";

    //occupation textField
    String occDropdownXpath="//select[@formcontrolname='occupation']";
    String occDropdownCss="select[formcontrolname='occupation']";

    //check gender box
    String checkXpath="//input[@value='Male']";
    String checkCss="input[value='Male']";

    //registerPassword textField
    String registerPasswordXpath="//input[@id='userPassword']";
    String registerPasswordCss="input[id='userPassword']";

    //registerConformPassword textField
    String registerConformPasswordXpath="//input[@id='confirmPassword']";
    String registerConformPasswordCss="input[id='confirmPassword']";

    //checkbox
    String registerCheckboxXpath="//input[@type='checkbox']";
    String registerCheckboxCss="input[type='checkbox']";

    //login textField
    String registerLoginXpath="//input[@id='login']";
    String registerLoginCss="input[id='login']";

    String productAddToCartButton="//b[text()='ZARA COAT 3']//..//..//button//i[@class='fa fa-shopping-cart']";
    String cartButton = "//button[@routerlink='/dashboard/cart']";
    String productName ="div[class='cartSection'] h3";
    String productPrice="//div[@class='prodTotal cartSection']";
    String checkButton="//button[text()='Checkout']";
    String cardNumber="//div[text()='Credit Card Number ']//..//input[@type='text']";
    String expiryMonth="//div[text()='Expiry Date ']//..//select[1]";
    String expiryDate="//div[text()='Expiry Date ']//..//select[2]";
    String cvvNumber="//div[text()='CVV Code ']//..//input";
    String cardName="//div[text()='Name on Card ']//..//input";
    String emailAddress="//div[@class='user__name mt-5']//input[@type='text']";
    String countryName="//input[@placeholder='Select Country']";
    String selectIndia="//button[@type='button'][2]";
    String placeOrderButton="//div[@class='actions']//a";
    String successFullMsg="//td[@align='center']//h1";
    String clickHistory="//label[text()=' Orders History Page ']";
    String orderId="//label[@class='ng-star-inserted']";
    String orderId2="//th[@scope='row']";
    String viewButton="//button[@class='btn btn-primary']";
    String orderSummary="//div[@class='email-title']";



}
