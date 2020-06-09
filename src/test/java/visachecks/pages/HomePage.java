package visachecks.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(xpath = "//button[contains(.,'Accept all cookies')]")
    WebElementFacade btnCookie;

    public void clickAcceptCookies(){
        if(btnCookie.isCurrentlyVisible())
            btnCookie.click();
    }
}
