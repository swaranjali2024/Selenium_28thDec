package pageobjects;

import org.openqa.selenium.By;

public class InventoryPage {

    //public static By items_names = By.xpath("//div[@class=\"inventory_item_name \"]");

    //public static By items_desc = By.xpath("//div[@class=\"inventory_item_description\"]");

    //public static By items_prices = By.xpath("//div[@class=\"inventory_item_price\"]");

    //public static By inventory_List = By.xpath("//div[@class=\"inventory_item\"]");

    public static By items_names = By.xpath("//*[@id=\"item_2_title_link\"]/div");


    public static By items_desc = By.xpath("//div[@data-test='inventory_item_description']");

    public static By items_prices = By.xpath("//div[@data-test='inventory_item_price']");

    public static By inventory_List = By.xpath("//div[@data-test='inventory_item']");

    public static By itemaddedInShoppingCart = By.xpath("//*[@id=\"item_2_title_link\"]/div");

}
