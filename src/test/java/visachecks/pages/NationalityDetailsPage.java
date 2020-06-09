package visachecks.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NationalityDetailsPage extends PageObject {

    @FindBy(id = "response")
    public WebElementFacade rdoResponse;

    @FindBy(xpath = "//button[contains(text(),'Next step')]")
    public WebElementFacade btnNextStep;

    public void selectNationality(String countryName){
        rdoResponse.selectByVisibleText(countryName);
    }

    public void clickNextStep(){
        btnNextStep.click();
    }
}

