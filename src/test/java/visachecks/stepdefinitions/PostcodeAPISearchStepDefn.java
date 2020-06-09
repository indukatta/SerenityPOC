package visachecks.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import visachecks.steps.PostcodeAPISearchSteps;

public class PostcodeAPISearchStepDefn {

    @Steps
    PostcodeAPISearchSteps statusSteps;

    @Given("User sets the postcode service api endpoint")
    public void user_set_postcode_api_endpoint(){
        statusSteps.setPostcodeAPIEndpoint();
    }

    @When("User sends a Get HTTP request to search postcode : {string}")
    public void user_selects_visit_family_option(String postcode){
        statusSteps.searchPostcode(postcode);
    }

    @Then("User should receive a response status : {int}")
    public void verify_response_status(int status){
        statusSteps.searchIsExecutedSuccessfully(status);
    }
}
