package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.*;

import java.time.Duration;
import java.util.List;

public class Sauce_Demo {

    WebDriver driver;

    @BeforeMethod
    public void beforeTestCase() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(LoginPage.username).sendKeys("standard_user");
        driver.findElement(LoginPage.password).sendKeys("secret_sauce");
        driver.findElement(LoginPage.login_button).click();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterTestCase() {
        driver.close();
    }

        @Test(priority = 1)
        public void login_Page() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            String title = "Swag Labs";
            String actual_title = driver.getTitle();
            Assert.assertEquals(actual_title,title);
            System.out.println("The page title has been successfully verified");
        }
        @Test(priority = 2)
    public void sort_Filter() throws InterruptedException {

            WebElement dropdownelement = driver.findElement(Filter_SortPage.dropdown);
            Thread.sleep(10000);
            Select select = new Select(dropdownelement);
            select.selectByVisibleText("Price (low to high)");

        }
        @Test(priority=3)
        public void product_Details(){
        //List <WebElement> product_names = driver.findElements(Object_Locators.items_names);
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

        @Test(priority = 4)
        public void addtoCart() throws InterruptedException {
        sort_Filter();
            Thread.sleep(10000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(Products_CartsPage.addToCartButton).click();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


            Thread.sleep(10000);

        driver.findElement(Products_CartsPage.clickonShoppingCart).click();
            Thread.sleep(10000);

        }
    }

