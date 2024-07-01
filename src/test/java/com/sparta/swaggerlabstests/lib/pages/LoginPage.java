package com.sparta.swaggerlabstests.lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private String username;
    private String password;
    private By loginButton = By.id("login-button");
    private By loginName = By.id("user-name");
    private By loginPass = By.id("password");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected boolean isCorrectPage() {
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/v1/index.html");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void enterLoginDetails(){
        webDriver.findElement(loginName).sendKeys(username);
        webDriver.findElement(loginPass).sendKeys(password);
    }

    public WebDriver clickLogin() {
        enterLoginDetails();
        webDriver.findElement(loginButton).click();
        return webDriver;
    }

}
