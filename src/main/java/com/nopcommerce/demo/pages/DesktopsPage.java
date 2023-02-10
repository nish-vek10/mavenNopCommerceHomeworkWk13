package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {

    //Locators for each element
    By desktopsText = By.xpath("//h1[text()='Desktops']");
    By buildYourOwnComp = By.xpath("//h2//a[text()='Build your own computer']");
    By sortByDropMenu = By.id("products-orderby");
    By displayMenu = By.id("products-pagesize");
    By selectProductList = By.xpath("//a[@title='List']");

    //Get Desktops Text on Desktop page
    public String getDesktopText() {
        return getTextFromElement(desktopsText); //call method from Utility class
    }

    //Click on Build Your Own Computer product
    public void clickOnBuildYourOwnComp() {
        clickOnElement(buildYourOwnComp); //call method from Utility class
    }

    //Click on Sort by Dropdown Menu
    public void clickOnSortByDropDownMenu() {
        clickOnElement(sortByDropMenu); //call method from Utility class
    }

    //Click on Display Dropdown Menu
    public void clickOnDisplayDropDownMenu() {
        clickOnElement(displayMenu); //call method from Utility class
    }

    //Click on List View
    public void clickOnListView() {
        clickOnElement(selectProductList); //call method from Utility class
    }
}