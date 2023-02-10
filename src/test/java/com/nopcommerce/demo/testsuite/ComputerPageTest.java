package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {

    //Create objects
    HomePage homePage;
    ComputerPage computers;
    DesktopsPage desktops;
    BuildYourOwnComputerPage buildComputer;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        computers = new ComputerPage();
        desktops = new DesktopsPage();
        buildComputer = new BuildYourOwnComputerPage();
    }

    @Test
    //Verify User is able to navigate to Computers page successfully
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputersTab(); //Click on Computers Tab from Homepage
        String actualText = computers.getComputersText(); //Get Computers Text from Computers page
        String expectedText = "Computers"; //Expected Message
        Assert.assertEquals(actualText, expectedText, "Computers Page Verified!"); //Compare and Verify test
    }

    @Test
    //Verify User is able to navigate to Desktops page successfully
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputersTab(); //Click on Computers Tab from Homepage
        computers.clickOnDesktopsLink(); //Click on Desktops link from Computer page
        String actualText = desktops.getDesktopText(); //Get Desktops Text from Desktops page
        String expectedText = "Desktops"; //Expected Message
        Assert.assertEquals(actualText, expectedText, "Desktops Page Verified!"); //Compare and Verify test
    }

    @Test(dataProvider = "Build Your Own PC Data", dataProviderClass = TestData.class)
    //Verify User is able to add product to cart successfully
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
            (String processor, String ram, String hdd, String os, String software) {
        homePage.clickOnComputersTab(); //Click on Computers Tab from Homepage
        computers.clickOnDesktopsLink(); //Click on Desktops link from Computer page
        desktops.clickOnBuildYourOwnComp(); //Click on 'Build your own computer' product
        buildComputer.selectProcessor(processor); //Select processor
        buildComputer.selectRAM(ram); //Select RAM
        buildComputer.selectHDD(hdd); //Select HDD
        buildComputer.selectOS(os); //Select Vista Premium OS
        buildComputer.selectSoftware(software); //Select Microsoft Office Software
        buildComputer.clickOnAddToCartButton(); //Add item to cart
        String actualText = buildComputer.getAlertMessage(); //Get Alert Message
        String expectedText = "The product has been added to your shopping cart"; //Expected Message
        Assert.assertEquals(actualText, expectedText, "Alert Message Verified!"); //Compare and Verify test
    }
}