package com.sparta.swaggerlabstests.stepdefs;

import com.sparta.swaggerlabstests.lib.pages.LoginPage;
import com.sparta.swaggerlabstests.lib.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.is;

public class LoginStepDefs extends StepDefsSuper{
    LoginPage loginPage;
    ProductsPage productsPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        webDriver.get("https://www.saucedemo.com/v1/index.html");
        loginPage = new LoginPage(webDriver);
    }

    @When("I input a valid username and password")
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
//        MatcherAssert.assertThat(productsPage.getUrl(), is("https://www.saucedemo.com/v1/inventory.html"));
    }


//    @When("I login with the following details")
//    public void iLoginWithTheFollowingDetails() {
//    }
}
