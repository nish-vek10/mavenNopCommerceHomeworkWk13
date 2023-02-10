package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //Locators for each element
    By computersMenu = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By electronicsMenu = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    By apparelMenu = By.xpath("//ul[@class='top-menu notmobile']/li[3]");
    By digDownMenu = By.xpath("//ul[@class='top-menu notmobile']/li[4]");
    By booksMenu = By.xpath("//ul[@class='top-menu notmobile']/li[5]");
    By jewelryMenu = By.xpath("//ul[@class='top-menu notmobile']/li[6]");
    By giftCardsMenu = By.xpath("//ul[@class='top-menu notmobile']/li[7]");
    By loginLink = By.className("ico-login");
    By registerLink = By.className("ico-register");
    By nopCommerceLogo = By.xpath("//img[@alt='nopCommerce demo store']");
    By myAccountLink = By.className("ico-account");
    By logoutLink = By.className("ico-logout");

    //Click on Computers MenuTab
    public void clickOnComputersTab() {
        clickOnElement(computersMenu); //Call method from Utility class
    }

    //Click on Electronics MenuTab
    public void clickOnElectronicsTab() {
        clickOnElement(electronicsMenu); //Call method from Utility class
    }

    //Click on Apparel MenuTab
    public void clickOnApparelTab() {
        clickOnElement(apparelMenu); //Call method from Utility class
    }

    //Click on Digital Downloads MenuTab
    public void clickOnDigDownMenuTab() {
        clickOnElement(digDownMenu); //Call method from Utility class
    }

    //Click on Books MenuTab+
    public void clickOnBooksMenu() {
        clickOnElement(booksMenu); //Call method from Utility class
    }

    //Click on Jewelry MenuTab
    public void clickOnJewelryMenu() {
        clickOnElement(jewelryMenu); //Call method from Utility class
    }

    //Click on Gift Cards MenuTab
    public void clickOnGiftCardsMenu() {
        clickOnElement(giftCardsMenu); //Call method from Utility class
    }

    //Click on Login Link
    public void clickOnLoginLink() {
        clickOnElement(loginLink); //Call method from Utility class
    }

    //Get Logout Text after login
    public String getLogInText() {
        return getTextFromElement(loginLink); //call method from Utility class
    }

    //Click on Register Link
    public void clickOnRegisterLink() {
        clickOnElement(registerLink); //Call method from Utility class
    }

    //Click on noCommerce logo
    public void clickOnNopCommerceLogo() {
        clickOnElement(nopCommerceLogo); //Call method from Utility class
    }

    //Click on My Account Link
    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink); //Call method from Utility class
    }

    //Click on Logout Link
    public void clickOnLogoutLink() {
        clickOnElement(logoutLink); //Call method from Utility class
    }

    //Get Logout Text after login
    public String getLogOutText() {
        return getTextFromElement(logoutLink); //call method from Utility class
    }
}