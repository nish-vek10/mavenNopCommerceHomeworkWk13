package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    //Locators for each element
    By buildYourOwnComp = By.xpath("//h1[text()='Build your own computer']");
    By processorType = By.xpath("//select[@id='product_attribute_1']");
    By selectRAM = By.xpath("//select[@id='product_attribute_2']");
    By hdd320 = By.xpath("//input[@id='product_attribute_3_6']");
    By hdd400 = By.xpath("//input[@id='product_attribute_3_7']");
    By osVistaHome = By.xpath("//input[@id='product_attribute_4_8']");
    By osVistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
    By softMS = By.xpath("//input[@id='product_attribute_5_10']");
    By softAdobe = By.xpath("//input[@id='product_attribute_5_11']");
    By softTotalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By addToCartMsg = By.xpath("//p[@class='content']");

    //Get Build Your Own Computer Text on from page
    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComp); //call method from Utility class
    }

    //Select Processor from dropdown Menu
    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorType, processor); //Choose processor
    }

    //Select RAM from dropdown Menu
    public void selectRAM(String ram) {
        selectByVisibleTextFromDropDown(selectRAM, ram); //Choose processor
    }

    //Select HDD
    public void selectHDD(String hdd) {
        if (hdd == "320 GB") {
            clickOnElement(hdd320); //Call method from Utility class
        } else if (hdd == "400 GB [+$100.00]") {
            clickOnElement(hdd400); //Call method from Utility class
        }
    }

    //Select OS
    public void selectOS(String os) {
        if (os == "Vista Home [+$50.00]") {
            clickOnElement(osVistaHome); //Call method from Utility class
        } else if (os == "Vista Premium [+$60.00]") {
            clickOnElement(osVistaPremium); //Call method from Utility class
        }
    }

    //Select Software
    public void selectSoftware(String software) {
        if (software == "Microsoft Office [+$50.00]") {
            clickOnElement(softMS); //Call method from Utility class
        } else if (software == "Acrobat Reader [+$10.00]") {
            clickOnElement(softAdobe); //Call method from Utility class
        } else if (software == "Total Commander [+$5.00]") {
            clickOnElement(softTotalCommander); //Call method from Utility class
        }
    }

    //Click on Add to Cart Button
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart); //Call method from Utility class
    }

    //Get Alert Message
    public String getAlertMessage() {
        return getTextFromElement(addToCartMsg); //call method from Utility class
    }

    public void dismissAddedToCartMessage() {
        dismissAlert();
    }
}