package visachecks.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VisitFamilyOptionPage extends PageObject {

    public void selectVisitFamilyOption(String option){
        $(By.xpath("//input[@value='"+ option.toLowerCase() +"']")).click();
    }
}
