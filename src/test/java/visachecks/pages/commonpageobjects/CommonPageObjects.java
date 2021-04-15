package visachecks.pages.commonpageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class CommonPageObjects extends PageObject {

    @FindBy(xpath = "//button[contains(text(),'Next step')]")
    public WebElementFacade btnNextStep;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    public WebElementFacade btnContinue;

    @FindBy(tagName = "h1")
    public WebElementFacade txtQuestion;

    public void clickNextStep(){
        btnNextStep.click();
    }

    public void clickContinue(){
        btnContinue.click();
    }

    public void verifyQuestionText(String question){
        String actual = txtQuestion.getText();
        Assert.assertEquals("Verify visa question", question, actual);
    }
}

