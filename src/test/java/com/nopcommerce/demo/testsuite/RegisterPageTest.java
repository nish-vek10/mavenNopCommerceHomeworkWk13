package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    //Create objects
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    //Test to Verify User is able to Navigate to Register Page
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink(); //Click on Register Link, call method from HomePage class
        String actualText = registerPage.getRegisterText(); //Get Register Text after login
        String expectedText = "Register"; //Expected Message
        Assert.assertEquals(actualText, expectedText, "Register Page Verified!"); //Compare and Verify test
    }

    @Test
    //Verify Error Messages
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homepage.clickOnRegisterLink(); //Click on Register Link, call method from HomePage class
        registerPage.clickOnRegisterButton(); //Click on Register button

        String aFNameMsg = registerPage.getFirstNameRequiredMessage(); //Get First name field error message
        String eFNameMsg = "First name is required."; //Expected Message
        Assert.assertEquals(aFNameMsg,eFNameMsg, "First Name field is Mandatory!"); //Compare and Verify

        String aLNameMsg = registerPage.getLastNameRequiredMessage(); //Get Last name field error message
        String eLNameMsg = "Last name is required."; //Expected Message
        Assert.assertEquals(aLNameMsg,eLNameMsg, "Last Name field is Mandatory!"); //Compare and Verify

        String aEmailMsg = registerPage.getEmailRequiredMessage(); //Get Email field error message
        String eEmailMsg = "Email is required."; //Expected Message
        Assert.assertEquals(aEmailMsg,eEmailMsg, "Email field is Mandatory!"); //Compare and Verify

        String aPasswordMsg = registerPage.getPasswordRequiredMessage(); //Get Password field error message
        String ePasswordMsg = "Password is required."; //Expected Message
        Assert.assertEquals(aPasswordMsg,ePasswordMsg, "Password field is Mandatory!"); //Compare and Verify

        String aConfirmPassMsg = registerPage.getConfirmPasswordRequiredMessage(); //Get Confirm Password field error message
        String eConfirmPassMsg = "Password is required."; //Expected Message
        Assert.assertEquals(aConfirmPassMsg,eConfirmPassMsg, "Confirm Password field is Mandatory!");
    }

    @Test
    //Verify User is able to Create an Account Successfully
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homepage.clickOnRegisterLink(); //Click on Register Link, call method from HomePage class
        registerPage.clickOnFemaleRadioButton(); //Click on Female radio button
        registerPage.enterFirstName("Chandni"); //Enter First Name
        registerPage.enterLastName("Patel"); //Enter Last Name
        registerPage.enterBirthDay("14"); //Select from dropdown menu of Day
        registerPage.enterBirthMonth("2"); //Select "February" from dropdown menu of Month
        registerPage.enterBirthYear("1990"); //Select from dropdown menu of Year
        registerPage.enterEmail("codebuster1026@gmail.com"); //Enter Email ID
        registerPage.enterPassword("Admin123"); //Enter Password
        registerPage.enterConfirmPassword("Admin123"); //Enter Password again in Confirm Password field
        registerPage.clickOnRegisterButton(); //Click on Register button
        String actualText = registerPage.getRegistrationCompletedMessage(); //Get Registration completed text
        String expectedText = "Your registration completed"; //Expected Message
        //Compare and Verify test
        Assert.assertEquals(actualText,expectedText, "Registration Completed Successfully!");
    }
}