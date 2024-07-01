package com.sparta.swaggerlabstests.lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    private static final By PRODUCT_SAUCE_LABS_BACKPACK = new By.ById("item_4_title_link");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected boolean isCorrectPage() {
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/v1/");
    }

    public void removeProduct() {
        WebElement parentElement = webDriver.findElement(PRODUCT_SAUCE_LABS_BACKPACK);
        WebElement removeButton = parentElement.findElement(By.xpath(".//button[@class='btn_secondary cart_button' and text()='REMOVE']"));
        removeButton.click();
    }
}
