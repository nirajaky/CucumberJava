package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Glue Codes are here
public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Step 1 : user is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Step 2 : user enters username and password");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Step 3 : clicks on login button");
    }

    @Then("user is redirect to home page")
    public void user_is_redirect_to_home_page() {
        System.out.println("Step 4 : user is redirect to home page");
    }
    public void demo(){
        System.out.println("For GitHub");
    }
}
