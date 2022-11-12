package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResult_stepDefinitions {
    LoginPage loginPage = new LoginPage();
    @And("I login as a librarian")
    public void iLoginAsALibrarian() {
        loginPage.emailBox.sendKeys("librarian1@library");
        loginPage.passwordBox.sendKeys("qU9mrvur"+ Keys.ENTER);
    }

    @And("I click on Users link")
    public void iClickOnLink() {
        loginPage.usersLink.click();
    }

    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String>expectedNames) {

        List<String>actualNames = new ArrayList<>();
        for (WebElement each : loginPage.headerNames) {
           actualNames.add(each.getText());

        }
        System.out.println(actualNames);
        Assert.assertEquals(expectedNames,actualNames);


    }
}
