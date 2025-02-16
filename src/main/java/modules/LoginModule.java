package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;

import java.util.Properties;

public class LoginModule {

    Properties envProp;
    WebDriver driver;
    public LoginModule(WebDriver driver){

        this.driver = driver;
    }
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        //driver.findElement(LoginPage.username).sendKeys(username);
        //driver.findElement(LoginPage.password).sendKeys(password);
        //driver.findElement(LoginPage.login_button).click();
    }

    public void enterUsername(String username){
        driver.findElement(LoginPage.username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(LoginPage.password).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LoginPage.login_button).click();
    }
}
