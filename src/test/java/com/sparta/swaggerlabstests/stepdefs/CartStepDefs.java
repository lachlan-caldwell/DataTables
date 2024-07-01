package com.sparta.swaggerlabstests.stepdefs;

import com.sparta.swaggerlabstests.lib.pages.CartPage;
import com.sparta.swaggerlabstests.lib.pages.ProductsPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class CartStepDefs extends StepDefsSuper{
    private CartPage cartPage;
    private ProductsPage productsPage;
    private static ChromeDriverService service;
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private WebDriver webDriver;

    @BeforeAll
    public static void beforeAll() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @Before
    public void setUp(){
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }

    @After
    public void afterEach(){
        webDriver.quit();
    }

    @AfterAll
    public static void afterAll(){
        service.stop();
    }

    @Given("I am on the product page")
    public void iAmOnTheProductPage(){
        webDriver.get("https://www.saucedemo.com/v1/inventory.html");
        productsPage = new ProductsPage(webDriver);
    }

    @And("I add the first item to my cart")
    public void iAddTheFirstItemToMyCart(){
        productsPage.addFirstItem();
    }

    @And("I click the cart icon")
    public void iClickTheCartIcon(){
        cartPage = productsPage.clickCartIcon();
    }

    @When("I click the remove item button")
    public void iClickTheRemoveItemButton() {
        cartPage.removeProduct();
    }

    @Then("No items are displayed in cart")
    public void noItemsAreDisplayedInCart() {

    }
}
