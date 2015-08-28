package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/seventh")
public class BuyCarSeventh extends PageObject {

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[2]/div[2]/div/div[2]/div[1]/div/a")
    public
    WebElementFacade submitForFreebutton;

    @FindBy(className = "modal-content")
    public
    WebElementFacade successPopUp;

    @FindBy(xpath = "//*[@id=\"submitModal\"]/div[2]/div/div/div/h1")
    public
    WebElementFacade title_sucess;

    @FindBy(xpath = "//*[@id=\"submitModal\"]/div[2]/div/div/div/button")
    public
    WebElementFacade my_dashboard_button;

    public void clickSubmitForFreeButton() {
        submitForFreebutton.waitUntilClickable().click();
    }


    public void shouldSeeTheSuccessPopUpSucess() {
        //Assert.assertTrue(successPopUp.isDisplayed());
        successPopUp.waitUntilPresent();
        System.out.println(title_sucess.getText());
        Assert.assertTrue(title_sucess.containsText("Success"));
    }

    public void clckMyDashboardButton() {
        my_dashboard_button.click();
    }
}
