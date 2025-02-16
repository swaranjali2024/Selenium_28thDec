package step_definitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.LoginModule;

public class CheckOut_StepDef {
    LoginModule loginModule;

    @When("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        DriverFactory.clickonCheckOutButton();
    }
    @When("User fills in the checkout fields with valid data")
    public void user_fills_in_the_checkout_fields_with_valid_data() {
        DriverFactory.enterFirstName();
        DriverFactory.enterLastName();
        DriverFactory.enterPostalCode();
    }
    @Then("user click on continue button")
    public void user_click_on_continue_button() {
        DriverFactory.clickOncontinueButton();
    }
    @Then("user click on Finish button")
    public void user_click_on_finish_button() {
        DriverFactory.clickonFinishButton();
    }
    @Then("order is successfully dispatched")
    public void order_is_successfully_dispatched() {
        DriverFactory.verifyorderDispatchedSuccessfully();
    }
}
