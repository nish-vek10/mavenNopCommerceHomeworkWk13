package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    //Create objects
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    //Test to Verify Login Page
    public void userShouldNavigateToLoginPageSuccessFully() {
        homepage.clickOnLoginLink(); //Method called from HomePage class
        String actualMsg = loginPage.getWelcomeText(); //Get text from page
        String expectedMsg = "Welcome, Please Sign In!"; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Login Page Verified!"); //Compare and Verify test
    }

    @Test
    //Test to Verify Error Message with Invalid Credentials
    public void verifyTheErrorMessageWithInValidCredentials() {
        homepage.clickOnLoginLink(); //Method called from HomePage class
        loginPage.enterEmail("cbust55@gmail.com"); //Enter Invalid Email ID
        loginPage.enterPassword("admin123"); //Enter Invalid Password
        loginPage.clickOnLoginButton(); //Click on Login button
        String actualErrorMessage = loginPage.getErrorMessage(); //Get Error message from login page
        String expectedErrorMessage = "Login was Unsuccessful"; //Expected Error Message
        String.valueOf(actualErrorMessage.matches(expectedErrorMessage)); //Partial match text
    }

    @Test
    //Test to Verify Logout Link Displayed with Valid Credentials
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homepage.clickOnLoginLink(); //Method called from HomePage class
        loginPage.enterEmail("codebuster1026@gmail.com"); //Enter Valid Email ID
        loginPage.enterPassword("Admin123"); //Enter Valid Password
        loginPage.clickOnLoginButton(); //Click on Login button
        String actualText = homepage.getLogOutText(); //Get Logout Text after login
        String expectedText = "Log out"; //Expected Message
        Assert.assertEquals(actualText, expectedText, "Login Successful!"); //Compare and Verify test
    }

    @Test
    //Test to Verify Logout Successful after logging in with Valid Credentials
    public void verifyThatUserShouldLogOutSuccessFully() {
        homepage.clickOnLoginLink(); //Method called from HomePage class
        loginPage.enterEmail("codebuster55@gmail.com"); //Enter Valid Email ID
        loginPage.enterPassword("Admin123"); //Enter Valid Password
        loginPage.clickOnLoginButton(); //Click on Login button
        homepage.clickOnLogoutLink(); //Click on Logout Link
        String actualText = homepage.getLogInText(); //Get Logout Text after login
        String expectedText = "Log in"; //Expected Message
        Assert.assertEquals(actualText, expectedText, "Logout Successful!"); //Compare and Verify test
    }
}