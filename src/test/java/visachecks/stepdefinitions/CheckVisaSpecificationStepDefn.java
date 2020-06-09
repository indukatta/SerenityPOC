package visachecks.stepdefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import visachecks.steps.CheckVisaRequirementSteps;

public class CheckVisaSpecificationStepDefn {

    @Steps
    CheckVisaRequirementSteps statusSteps;

    @Given("I am on the UK Visa web page and I accept cookies")
    public void user_is_on_home_page(){
        statusSteps.openUKVisaHomePage();
    }

    @Given("I provide a nationality of {string}")
    public void user_selects_nationality(String countryName){
        statusSteps.selectNationality(countryName);
    }

    @And("I select the reason for visa as {string}")
    public void user_selects_visa_purpose(String purpose){
        statusSteps.selectVisaPurpose(purpose);
    }

    @ParameterType("true|false")
    public Boolean isStayMoreThan6M(String value) {
        return Boolean.valueOf(value);
    }

    @And("I state I am intending to stay for more than 6 months : {isStayMoreThan6M}")
    public void user_selects_length_of_stay(Boolean isStayMoreThan6M){
        statusSteps.selectLengthOfStay(isStayMoreThan6M);
    }

    @And("I state I am travelling or visiting a partner or family as {string}")
    public void user_selects_visit_family_option(String option){
        statusSteps.selectFamilyVisitOption(option);
    }

    @When("I submit the form")
    public void user_submit_the_form(){
        statusSteps.clickNextStep();
    }

    @Then("I will be informed {}")
    public void verify_visa_status_message(String message){
        statusSteps.verifyVisaStatusMessage(message);
    }
}