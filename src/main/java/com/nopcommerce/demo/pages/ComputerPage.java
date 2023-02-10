package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computersText = By.xpath("//h1[text()='Computers']");
    By desktopsLink = By.xpath("//a[text()=' Desktops ']");
    By notebooksLink = By.xpath("//a[text()=' Notebooks ']");
    By softwareLinks = By.xpath("//h1[text()='Computers']");

    //Get Computers Text on Computers page
    public String getComputersText() {
        return getTextFromElement(computersText); //call method from Utility class
    }

    //Click on Desktops Link
    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink); //call method from Utility class
    }

    //Click on Notebooks Link
    public void clickOnNotebooksLink() {
        clickOnElement(notebooksLink); //call method from Utility class
    }

    //Click on Software Link
    public void clickOnSoftwareLink() {
        clickOnElement(softwareLinks); //call method from Utility class
    }
}