package visachecks.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class VisaRequirementStatusDetailsPage extends PageObject {

    @FindBy(xpath = "//div[contains(.,'Check if you need a UK visa')]/div/h2")
    public WebElementFacade txtVisaStatusMessage;

    public void verifyVisaStatusMessage(String message){
        String actual = txtVisaStatusMessage.getText();
        Assert.assertEquals("Verify visa status message", message.replace("'",""), actual);
    }
}
