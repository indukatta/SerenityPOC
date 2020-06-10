package visachecks.steps;

import net.thucydides.core.annotations.Step;
import visachecks.pages.*;
import visachecks.pages.commonpageobjects.CommonPageObjects;

public class CheckVisaRequirementSteps {

    HomePage homePage;
    NationalityDetailsPage nationalityDetailsPage;
    VisaReasonPage visaReasonPage;
    VisitFamilyOptionPage familyOptionPage;
    DurationOfStayPage durationOfStayPage;
    VisaRequirementStatusDetailsPage visaStatusPage;
    CommonPageObjects commonPageObjects;

    @Step
    public void openUKVisaHomePage(){
        homePage.open();
        homePage.clickAcceptCookies();
    }

    @Step
    public void selectNationality(String countryName){
        nationalityDetailsPage.selectNationality(countryName);
    }

    @Step
    public void selectVisaPurpose(String purpose){
        clickNextStep();
        commonPageObjects.verifyQuestionText(VisaReasonPage.QUES_VISA_PURPOSE);
        visaReasonPage.selectReason(purpose);
    }

    @Step
    public void selectLengthOfStay(boolean isStayMoreThan6M){
        clickNextStep();
        commonPageObjects.verifyQuestionText(DurationOfStayPage.QUES_LENGTH_OF_STAY);
        durationOfStayPage.selectDurationOfStay(isStayMoreThan6M);
    }

    @Step
    public void selectFamilyVisitOption(String option){
        clickNextStep();
        commonPageObjects.verifyQuestionText(VisitFamilyOptionPage.QUES_FAMILY_VISIT);
        familyOptionPage.selectVisitFamilyOption(option);
    }

    @Step
    public void clickNextStep(){
        commonPageObjects.clickNextStep();
    }

    @Step
    public void verifyVisaStatusMessage(String message){
        visaStatusPage.verifyVisaStatusMessage(message);
    }

}
