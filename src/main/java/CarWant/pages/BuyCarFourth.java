package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/fourth")
public class BuyCarFourth extends PageObject{

    @FindBy(name = "login-button")
    public
    WebElementFacade nextStepButton;

    public void clickNextStepButton() {
        nextStepButton.waitUntilEnabled().click();
    }
}
