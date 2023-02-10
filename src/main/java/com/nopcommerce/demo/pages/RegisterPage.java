package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    //Locators for each element
    By registerText = By.xpath("//h1[text()='Register']");
    By maleRadio = By.xpath("//input[@id='gender-male']");
    By femaleRadio = By.xpath("//input[@id='gender-female']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dobDay = By.name("DateOfBirthDay");
    By dobMonth = By.name("DateOfBirthMonth");
    By dobYear = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By firstNameMsg = By.id("FirstName-error");
    By lastNameMsg = By.id("LastName-error");
    By emailMsg = By.id("Email-error");
    By passwordMsg = By.id("Password-error");
    By confirmPasswordMsg = By.id("ConfirmPassword-error");
    By completionMsg = By.className("result");
    By continueButton = By.xpath("//a[text()='Continue']");

    //Get Register Text on Register page
    public String getRegisterText() {
        return getTextFromElement(registerText); //call method from Utility class
    }

    //Click on Male radio button
    public void clickOnMaleRadioButton() {
        clickOnElement(maleRadio); //call method from Utility class
    }

    //Click on Female radio button
    public void clickOnFemaleRadioButton() {
        clickOnElement(femaleRadio); //call method from Utility class
    }

    //Enter First Name
    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName); //call method from Utility class
    }

    //Enter Last Name
    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName); //call method from Utility class
    }

    //Select Birth Day from dropdown Menu
    public void enterBirthDay(String birthDay) {
        selectByValueFromDropDown(dobDay, birthDay); //call method from Utility class
    }

    //Select Birth Month from dropdown Menu
    public void enterBirthMonth(String birthMonth) {
        selectByValueFromDropDown(dobMonth, birthMonth); //call method from Utility class
    }

    //Select Birth Year from dropdown Menu
    public void enterBirthYear(String birthYear) {
        selectByValueFromDropDown(dobYear, birthYear); //call method from Utility class
    }

    //Enter email ID
    public void enterEmail(String email) {
        sendTextToElement(emailField, email); //call method from Utility class
    }

    //Enter Password
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password); //call method from Utility class
    }

    //Enter in Confirm Password
    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword); //call method from Utility class
    }

    //Click on Register button
    public void clickOnRegisterButton() {
        clickOnElement(registerButton); //call method from Utility class
    }

    //Get 'First name required' error message
    public String getFirstNameRequiredMessage() {
        return getTextFromElement(firstNameMsg); //call method from Utility class
    }

    //Get 'Last name required' error message
    public String getLastNameRequiredMessage() {
        return getTextFromElement(lastNameMsg); //call method from Utility class
    }

    //Get 'Email required' error message
    public String getEmailRequiredMessage() {
        return getTextFromElement(emailMsg); //call method from Utility class
    }

    //Get 'Password required' error message
    public String getPasswordRequiredMessage() {
        return getTextFromElement(passwordMsg); //call method from Utility class
    }

    //Get 'Confirm password required' error message
    public String getConfirmPasswordRequiredMessage() {
        return getTextFromElement(confirmPasswordMsg); //call method from Utility class
    }

    //Get 'Registration Completed' message
    public String getRegistrationCompletedMessage() {
        return getTextFromElement(completionMsg); //call method from Utility class
    }

    //Click on Continue button
    public void clickOnContinueButton() {
        clickOnElement(continueButton); //call method from Utility class
    }
}