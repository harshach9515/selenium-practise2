package com.pratice;

public class PageElements {

    //userName Label
    String userNameLabelXpath = "//label[@for='username']";
    String userNameLabelCss = "label[for='username']";

    //Password Label
    String passwordLabelXpath = "//label[@for='password']";
    String passwordLabelCss = "label[for='password']";

    //Username input field
    String xpath = "//input[@id='username']";
    String css = "input[id='username']";

    //Password input field
    String passwordXpath = "//input[@id='password']";
    String passwordCss = "input[id='password']";

    //user checkbox
    String userCheckbox = "//input[@value='user']//..//span[@class='checkmark']";
    String adminCheckbox = "//input[@value='admin']//..//span[@class='checkmark']";

    //Select Dropdown
    String selectDropdownXpath = "//select[@class='form-control']";
    String selectDropdownCss = "select.form-control";

    //Terms and Conditions Radio Button
    String termsAndConditionsRadioButtonXpath = "//input[@id='terms']";
    String termsAndConditionsRadioButtonCss = "input#terms or input[id='terms'] or #terms";

    //Sign In Button
    String signInButtonXpath = "//input[@id='signInBtn']";
    String signInButtonCss = "input#signInBtn or input[id='signInBtn'] or #signInBtn or input[name='signin']";


}
