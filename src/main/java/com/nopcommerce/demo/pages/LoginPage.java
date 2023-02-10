package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //Locators for each element
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[text()='Log in']");
    By errorMsg = By.xpath("//div[@class='message-error validation-summary-errors']");

    //Get Welcome Text on login page
    public String getWelcomeText() {
        return getTextFromElement(welcomeText); //call method from Utility class
    }

    //Enter email ID
    public void enterEmail(String email) {
        sendTextToElement(emailField, email); //call method from Utility class
    }

    //Enter password
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password); //call method from Utility class
    }

    //Click on Login button
    public void clickOnLoginButton() {
        clickOnElement(loginButton); //call method from Utility class
    }

    //Get Error Message on Login page
    public String getErrorMessage() {
        return getTextFromElement(errorMsg); //call method from Utility class
    }
}