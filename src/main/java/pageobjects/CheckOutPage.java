package pageobjects;

import org.openqa.selenium.By;

public class CheckOutPage {

    public static By click_checkoutButton = By.id("checkout");

    public static By enter_FirstName = By.id("first-name");

    public static By enter_LastName = By.id("last-name");

    public static By Enter_PostalCode = By.id("postal-code");

    public static By clickonContinueButton = By.id("continue");

    public static By verifyorderDispatchText = By.xpath("//*[@id=\"checkout_complete_container\"]/div");

    public static By finishButton = By.id("finish");
}
