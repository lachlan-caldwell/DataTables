package com.sparta.swaggerlabstests.stepdefs;

import com.sparta.swaggerlabstests.lib.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends StepDefsSuper{
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        webDriver.get("https://www.saucedemo.com/v1/index.html");
        loginPage = new LoginPage(webDriver);
    }

    @When("I Input a valid Username and Password")
    public void iInputAValidUsernameAndPassword() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I will be taken to the Products Page")
    public void iWillBeTakenToTheProductsPage() {
    }
}
