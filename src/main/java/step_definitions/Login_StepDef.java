
package step_definitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.LoginModule;
import org.openqa.selenium.WebDriver;

public class Login_StepDef {
    public WebDriver driver;
    LoginModule login_module;
    //LoginModule login_module = new LoginModule(driver);

    @Given("user open Chrome")
    public void user_open_chrome() {
        DriverFactory.openBrowser();

        login_module = new LoginModule(DriverFactory.getDriver());

    }
    @And("user open URL {string}")
    public void user_open_url(String string) {
        DriverFactory.openURL(string);
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_cred(String username , String password) {
        login_module = new LoginModule(DriverFactory.getDriver());
        login_module.login(username, password);
    }

    @When("user enter username {string}")
    public void user_enter_username(String string) {
    login_module.enterUsername(string);
    }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        login_module.enterPassword(string);
    }
    @When("user click on Login button")
    public void user_click_on_login_button() {
        login_module.clickLoginButton();

    }
    /*
    @Then("user validate successful login screen")
    public void user_validate_successful_login_screen() {

    }*/
    @Then("user validate dashboard")
    public void user_validate_dashboard() {
        DriverFactory.verifyPageTitle();

    }
    @Then("user validate error message {string}")
    public void user_validate_error_message(String string) {
      DriverFactory.validateErrorMsg(string);

    }
}