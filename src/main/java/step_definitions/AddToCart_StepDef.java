package step_definitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.LoginModule;

public class AddToCart_StepDef {

    LoginModule login_module;

    @When("user select product from products list")
    public void user_select_product_from_products_list() {
        /*String Expected_productName = "Sauce Labs Onesie";
        WebElement product_names1 = driver.findElement(InventoryPage.items_names);
        String act_Productname = product_names1.getText();
        Assert.assertEquals(Expected_productName, act_Productname);*/
        DriverFactory.user_select_product_from_products_list();
    }

    @When("user click on {string} button for selected product")
    public void user_click_on_button_for_selected_product(String string) {
        //driver.findElement(Products_CartsPage.item_name1);
        //driver.findElement(Products_CartsPage.addToCartButton).click();
        DriverFactory.user_click_on_button_for_selected_product();
    }

    @Then("the product gets added to the cart")
    public void the_product_gets_added_to_the_cart() {
        //driver.findElement(Products_CartsPage.clickonShoppingCart).click();
        DriverFactory.the_product_should_be_added_to_the_cart();
    }

    @Then("the cart should contain one item")
    public void the_cart_should_contain_one_item() {
        /*WebElement cart = driver.findElement(Shopping_Cart_page.cartIconCount);
        String itemCount = cart.getText();
        String exp_text = "1";
        Assert.assertEquals(exp_text, itemCount);*/
        DriverFactory.the_cart_should_contain_one_item();
    }


    @Then("the product should appear in the cart")
    public void the_product_should_appear_in_the_cart() {
     /*List <WebElement> cartItems = driver.findElements(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]"));
        WebElement firstCartItem = cartItems.get(0);
        String exp_text = "Sauce Labs Onesie";
        Assert.assertEquals(exp_text , firstCartItem.getText());*/
        DriverFactory.the_product_should_appear_in_the_cart();
    }
}
