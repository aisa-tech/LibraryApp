package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class LoginWithDifferentUsers_stepDefinitions {
    LoginPage loginPage = new LoginPage();
    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String arg0) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.userName).perform();
        Assert.assertEquals(arg0,loginPage.userName.getText());




    }
}
