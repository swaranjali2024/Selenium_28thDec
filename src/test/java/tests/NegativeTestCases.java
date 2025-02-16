package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjects.LoginPage;

public class NegativeTestCases extends BaseTest{

   /* WebDriver driver;
    Properties envProp;

    @BeforeTest
    public void loadEnvironment() throws IOException {
        Properties global = UtilitiesProp.readconfigProperties("global");
        envProp = UtilitiesProp.readconfigProperties(global.getProperty("env"));
    }

    @BeforeMethod
    public void beforeTestCase() {
        driver = new ChromeDriver();
        driver.get(envProp.getProperty("url"));
    }

    @AfterMethod
    public void afterTestCase() {
        driver.close();
    }*/

    @DataProvider(name = "loginData")
    public static Object[][] testdata() {
        Object[][] testdata = {
                {"" , "" , "Epic sadface: Username is required"},
                {"" , "secret_sauce" , "Epic sadface: Username is required"},
                {"problem_user" , "" ,  "Epic sadface: Password is required"},
                {"problem_user1" , "secret_sauce1" , "Epic sadface: Username and password do not match any user in this service"}
        };
        return testdata;


}

   /* @Test(priority = 1)
    public  void validate_valid_username_valid_password(){

        driver.manage().window().maximize();
        driver.findElement(Object_Locators.username).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //driver.close();
    }
    @Test(priority = 2)
    public void validate_empty_username_empty_password(){

        driver.manage().window().maximize();
        driver.findElement(Object_Locators.username).sendKeys("");
        driver.findElement(Object_Locators.password).sendKeys("");
        driver.findElement(Object_Locators.login_button).click();
        WebElement error_msg = driver.findElement(Object_Locators.err_msg);
        String str = error_msg.getText();
        Assert.assertEquals(str, "Epic sadface: Username is required");
    }
    @Test(priority = 3)
    public void validate_blank_username_valid_password(){

        driver.manage().window().maximize();
        driver.findElement(Object_Locators.username).sendKeys("");
        driver.findElement(Object_Locators.password).sendKeys("secret_sauce");
        driver.findElement(Object_Locators.login_button).click();
        WebElement error_msg = driver.findElement(Object_Locators.err_msg);
        String str = error_msg.getText();

        Assert.assertEquals(str , "Epic sadface: Username is required");
    }
    @Test(priority = 4)
    public void validate_valid_username_blank_password(){

        driver.manage().window().maximize();
        driver.findElement(Object_Locators.username).sendKeys("problem_user");
        driver.findElement(Object_Locators.password).sendKeys("");
        driver.findElement(Object_Locators.login_button).click();
        WebElement error_msg = driver.findElement(Object_Locators.err_msg);
        String str = error_msg.getText();
        Assert.assertEquals(str, "Epic sadface: Password is required");
    }*/


    @Test(dataProvider = "loginData")
    public void validate_invalid_username_invalid_password(String username, String password, String expectedErrmsg){

        driver.manage().window().maximize();
        driver.findElement(LoginPage.username).sendKeys(username);
        driver.findElement(LoginPage.password).sendKeys(password);
        driver.findElement(LoginPage.login_button).click();
        WebElement error_msg = driver.findElement(LoginPage.err_msg);
        String str = error_msg.getText();
        Assert.assertEquals(str, expectedErrmsg);
    }





    }


