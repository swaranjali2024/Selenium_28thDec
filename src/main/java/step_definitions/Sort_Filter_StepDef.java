package step_definitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.LoginModule;

public class Sort_Filter_StepDef {
    LoginModule login_module;

    /*@Given("user is on Inventory page")
    public void user_is_on_inventory_page() {
        System.out.println("User is on Inventory page");
    }*/

    @When("user selects option {string} from dropdown")
        public void user_selects_option_from_dropdown(String string) {
        DriverFactory.sort_valuefromDropdown();
    }

    /*@Then("list of products gets displayed in alphabetical order from A to Z")
    public void list_of_products_gets_displayed_in_alphabetical_order_from_a_to_z() {
        System.out.println("user is on inventory page 3");
    }

    @Then("list of products gets displayed in reverse alphabetical order from Z to A")
    public void list_of_products_gets_displayed_in_reverse_alphabetical_order_from_z_to_a() {
        System.out.println("user is on inventory page 4");
    }*/

    @Then("list of products gets displayed in ascending order by price")
    public void list_of_products_gets_displayed_in_ascending_order_by_price() {
        DriverFactory.sortProductDetails();

    }

    /*@Then("list of products gets displayed in descending order by price")
    public void list_of_products_gets_displayed_in_descending_order_by_price() {
        System.out.println("user is on inventory page 6");
    }*/


}
