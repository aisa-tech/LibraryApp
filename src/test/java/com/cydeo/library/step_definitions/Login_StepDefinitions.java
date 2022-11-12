package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @Given("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.emailBox.sendKeys("librarian1@library");
    }
    @Given("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.passwordBox.sendKeys("qU9mrvur"+ Keys.ENTER);
      
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(loginPage.dashboard.getText().equals("Dashboard"));
    }
    @Given("user enters student username")
    public void user_enters_student_username() {
       loginPage.emailBox.sendKeys("student2@library");
      
    }
    @Given("user enters student password")
    public void user_enters_student_password() {
        loginPage.passwordBox.sendKeys("zyxa10vg" +Keys.ENTER);
    }

    @Then("books should be  displayed")
    public void booksShouldBeDisplayed() {
        Assert.assertTrue(loginPage.books.isDisplayed());
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        loginPage.emailBox.sendKeys(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @And("click the sign in button")
    public void clickTheSignInButton() {
        loginPage.signInBtn.click();
    }

    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
        loginPage.dashboard.isDisplayed();
    }

    @And("there should be {int} users")
    public void thereShouldBeUsers(int number) {
        Assert.assertEquals(number,Integer.parseInt(loginPage.userCount.getText()));


    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {
        loginPage.emailBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password + Keys.ENTER);
    }


    @And("there should be {int} {string}")
    public void thereShouldBeUsers(int arg0,String users) {
        loginPage.userCount.isDisplayed();
    }


}
