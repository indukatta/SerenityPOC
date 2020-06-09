package visachecks.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PostcodeAPISearchSteps {

    private String POSTCODE_SEARCH_BASE_URI = "https://api.postcodes.io/postcodes/";
    private Response response;

    @Step
    public void setPostcodeAPIEndpoint(){
        SerenityRest.setDefaultBasePath(POSTCODE_SEARCH_BASE_URI);
    }

    @Step
    public void searchPostcode(String postcode){
        response = SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .get(SerenityRest.getDefaultBasePath().concat(postcode));

        System.out.println("Response -> [" + response.getBody().asString() + "]");
    }

    @Step
    public void searchIsExecutedSuccessfully(int responseStatus){
        response.then().statusCode(responseStatus);
    }
}