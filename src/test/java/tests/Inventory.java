package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobjects.InventoryPage;

import java.util.List;

public class Inventory extends BaseTest{

    @Test
    public void inventoryPage(){

        login_module.login(envProp.getProperty("username"), envProp.getProperty("password"));

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
}
