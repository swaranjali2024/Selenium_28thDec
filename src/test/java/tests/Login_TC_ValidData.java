package tests;

import modules.LoginModule;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;

public class Login_TC_ValidData extends BaseTest {
        @Test
        public void validateTestwithValidData()  {

            login_module.login(envProp.getProperty("username"), envProp.getProperty("password"));
            //driver.findElement(Object_Locators.username).sendKeys(envProp.getProperty("username"));
            //driver.findElement(Object_Locators.password).sendKeys(envProp.getProperty("password"));
            //driver.findElement(Object_Locators.login_button).click();
            String title = "Swag Labs";
            String actual_title = driver.getTitle();
            Assert.assertEquals(actual_title,title);
            System.out.println("The page title has been successfully verified");
        }

}

