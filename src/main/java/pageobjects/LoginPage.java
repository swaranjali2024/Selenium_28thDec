package pageobjects;

import org.openqa.selenium.By;

public class LoginPage {

    public static By username = By.id("user-name");

    public static By password = By.id("password");

    public static By login_button = By.id("login-button");

    public static By err_msg = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
}
