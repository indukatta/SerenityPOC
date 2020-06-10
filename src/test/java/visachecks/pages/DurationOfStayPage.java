package visachecks.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class DurationOfStayPage extends PageObject {

    public static String QUES_LENGTH_OF_STAY = "How long are you planning to study in the UK for?";

    public void selectDurationOfStay(boolean isStayMoreThan6M){
        String value = isStayMoreThan6M ? "longer_than_six_months" : "six_months_or_less";
        WebElementFacade rdo = $(By.xpath("//input[@name='response'][@value='"+ value +"']"));
        rdo.click();
    }
}
