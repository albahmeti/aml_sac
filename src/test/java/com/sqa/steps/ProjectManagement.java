package com.sqa.steps;

import com.sqa.hooks.Environment;
import com.sqa.ui.pages.actions.SignIn;
import com.sqa.utils.Encoder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectManagement {
    @Autowired
    public SignIn signin;
    @Autowired
    Environment environment;

    @Given("User is logged into Microsoft account")
    public void userIsLoggedIntoMicrosoftAccount() {
        signin.clickSignIn();
        signin.enterEmail(environment.getUser());
        signin.clickNext();
        signin.enterPassword(new Encoder().decoder(environment.getPassword()));
        if(signin.isStaySignedIn())
            signin.clickYesAtStaySingedIn();
        signin.clickSignInMs();
    }
    @Given("user is on the SAC page")
    public void user_is_on_the_sac_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("click on Project Management page")
    public void click_on_project_management_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Test_Project and This is a test is entered a new project is created")
    public void test_project_and_this_is_a_test_is_entered_a_new_project_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("project history table should be visible")
    public void project_history_table_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("project is visible on the dropdown")
    public void project_is_visible_on_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("list items on SAC page should be enabled with the name of the project")
    public void list_items_on_sac_page_should_be_enabled_with_the_name_of_the_project() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
