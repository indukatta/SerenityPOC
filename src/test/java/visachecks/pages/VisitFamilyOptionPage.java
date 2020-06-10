package visachecks.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VisitFamilyOptionPage extends PageObject {

    public static String QUES_FAMILY_VISIT = "Will you be travelling with or visiting either your partner or a family member in the UK?";

    public void selectVisitFamilyOption(String option){
        $(By.xpath("//input[@value='"+ option.toLowerCase() +"']")).click();
    }
}
