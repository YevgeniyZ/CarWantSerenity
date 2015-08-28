package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/fifth")
public class BuyCarFifth extends PageObject{

    @FindBy(id = "buy5form-state")
    public
    WebElementFacade selectstatedrop;

    @FindBy(name = "login-button")
    public
    WebElementFacade nextButton;




    public void selectState() {

    }

    public void clickNextStepButton5() {
        nextButton.waitUntilClickable().click();
    }


}
