package tests;

import modules.LoginModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.UtilitiesProp;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    WebDriver driver;
    Properties envProp;
    LoginModule login_module;


    @BeforeTest
    public void loadEnvironment() throws IOException {
        Properties global = UtilitiesProp.readconfigProperties("global");
        envProp = UtilitiesProp.readconfigProperties(global.getProperty("env"));

    }

    @BeforeMethod
    public void beforeTestCase() throws IOException {
        driver = new ChromeDriver();
        driver.get(envProp.getProperty("url"));
         login_module= new LoginModule(driver);
        driver.manage().window().maximize();
//        Login_TC_ValidData tc = new Login_TC_ValidData(driver);
//        tc.validateTestwithValidData();

    }

    @AfterMethod
    public void afterTestCase() {
        driver.close();
    }





    }



