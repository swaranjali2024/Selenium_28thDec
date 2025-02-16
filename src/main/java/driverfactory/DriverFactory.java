package driverfactory;

import modules.LoginModule;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.*;

import java.time.Duration;
import java.util.List;

public class DriverFactory {
    static LoginModule login_module;
     public static WebDriver driver;

    public static WebDriver openBrowser(){
        driver = new ChromeDriver();
        login_module= new LoginModule(driver);
        driver.manage().window().maximize();
        return driver;
    }

    public static void openURL(String url){
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void validateErrorMsg(String expectedErrmsg){
        WebElement error_msg = driver.findElement(LoginPage.err_msg);
        String str = error_msg.getText();
        Assert.assertEquals(str, expectedErrmsg);

    }
    public static void verifyPageTitle(){
        String title = "Swag Labs";
        String actual_title = driver.getTitle();
        Assert.assertEquals(actual_title,title);
        System.out.println("The page title has been successfully verified");
    }

    public static void sort_valuefromDropdown(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Filter_SortPage.dropdown));
        WebElement dropdownelement = driver.findElement(Filter_SortPage.dropdown);
        Select select = new Select(dropdownelement);
        select.selectByVisibleText("Price (low to high)");
    }

    public static void sortProductDetails(){
        List<WebElement> product_names = driver.findElements(InventoryPage.inventory_List);
        for (int i=0;i<product_names.size();i++)
        {
            WebElement product_names1 = driver.findElement(InventoryPage.items_names);
            String name = product_names1.getText();
            System.out.println("Product name is:" +name);

            WebElement product_desc = driver.findElement(InventoryPage.items_desc);
            String description = product_desc.getText();
            System.out.println("Product descriptions is:" +description);

            WebElement product_prices = driver.findElement(InventoryPage.items_prices);
            String Price = product_prices.getText();
            System.out.println("Product price is:" +Price);

            System.out.println("-----------");
        }
    }

    public static void user_select_product_from_products_list(){
        String Expected_productName = "Sauce Labs Onesie";
        WebElement product_names1 = driver.findElement(InventoryPage.items_names);
        String act_Productname = product_names1.getText();
        Assert.assertEquals(Expected_productName, act_Productname);
    }

    public static void user_click_on_button_for_selected_product(){
        driver.findElement(Products_CartsPage.item_name1);
        driver.findElement(Products_CartsPage.addToCartButton).click();
    }

    public static void the_product_should_be_added_to_the_cart(){
        driver.findElement(Products_CartsPage.clickonShoppingCart).click();
    }

    public static void the_cart_should_contain_one_item(){
        WebElement cart = driver.findElement(Shopping_Cart_page.cartIconCount);
        String itemCount = cart.getText();
        String exp_text = "1";
        Assert.assertEquals(exp_text, itemCount);
    }

    public static void the_product_should_appear_in_the_cart(){
        //List <WebElement> cartItems = driver.findElements(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]"));
        String exp_text = "Sauce Labs Onesie";
        WebElement cartItemName = driver.findElement(InventoryPage.itemaddedInShoppingCart);
        String act_text = cartItemName.getText();
        Assert.assertEquals(exp_text , act_text);
    }

    //CHECK-OUT PAGE
    public static void clickonCheckOutButton(){
        driver.findElement(CheckOutPage.click_checkoutButton).click();
    }
    public static void enterFirstName(){
        driver.findElement(CheckOutPage.enter_FirstName).sendKeys("Test");
    }
    public static void enterLastName(){
        driver.findElement(CheckOutPage.enter_LastName).sendKeys("Test1234");
    }
    public static void enterPostalCode(){
        driver.findElement(CheckOutPage.Enter_PostalCode).sendKeys("90620");
    }
    public static void clickOncontinueButton(){
        driver.findElement(CheckOutPage.clickonContinueButton).click();
    }
    public static void clickonFinishButton(){
        driver.findElement(CheckOutPage.finishButton).click();
    }
    public static void verifyorderDispatchedSuccessfully(){
        WebElement orderDispatch = driver.findElement(CheckOutPage.verifyorderDispatchText);
        String act_text = orderDispatch.getText();
        String expected_Text = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        Assert.assertEquals(expected_Text, act_text);
        System.out.println("Checkout is successful");


    }
    public static void closeBrowser(){
        driver.close();
    }


}
