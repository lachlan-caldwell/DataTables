package com.sparta.swaggerlabstests.lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    private static final By PRODUCT_DIV = By.className("inventory_item");
    private static final By PRODUCT_TITLE = By.className("inventory_item_label");
    private static final By PRODUCT_INFO = By.className("inventory_item_desc");
    private static final By ADD_TO_CART = By.className("btn_primary btn_inventory");

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected boolean isCorrectPage() {
        return true;
    }
}
