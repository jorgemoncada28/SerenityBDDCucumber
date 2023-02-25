package TestSerenityBDDCucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import TestSerenityBDDCucumber.Pages.Dashboard;
import TestSerenityBDDCucumber.Pages.HomePage;

public class LoginToApplication {

    @Steps
    HomePage home;
    @Steps
    Dashboard dash;

    @Given("user is on home page")
    public void user_is_on_home_page() {
        home.openApplication();
    }

    @When("user enters admin as username")
    public void user_enters_admin_as_username() {
        home.enterUsername();
    }

    @When("user enters admin123 as password")
    public void user_enters_admin123_as_password() {
        home.enterPassword();
        home.clickOnLoginButton();
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        dash.verifyAdmin();
    }
}
