package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Products_CartsPage;

import java.io.IOException;

public class Products_addToCart extends BaseTest{

    @Test(priority = 1)
    public void productsPage() throws IOException, InterruptedException {
        login_module.login(envProp.getProperty("username"), envProp.getProperty("password"));
        driver.findElement(Products_CartsPage.item_name1);
        driver.findElement(Products_CartsPage.addToCartButton).click();
        driver.findElement(Products_CartsPage.clickonShoppingCart).click();
        String pageTitle = "Your Cart";
        String act_text = driver.getTitle();
        Assert.assertEquals(act_text , pageTitle);
        System.out.println("The page title has been verified");

    }
    @Test(priority = 2)
    public void checkoutProcess(){
        login_module.login(envProp.getProperty("username"), envProp.getProperty("password"));
        //driver.findElement(Products_CartsPage.click_checkoutButton);

    }
}
