package visachecks.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.util.List;

public class VisaReasonPage extends PageObject {

    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    public List<WebElementFacade> rdoReasons;

    public void selectReason(String purpose){
        for(WebElementFacade rdo : rdoReasons){
            if(rdo.getText().contains(purpose)){
                rdo.findElement(By.name("response")).click();
                break;
            }
        }
    }
}
