package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/third")
public class BuyCarThird extends PageObject{

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[2]/div[1]/button")
    public
    WebElementFacade model_drop_down;

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[2]/div[1]/div/ul/li[6]/a")
    public
    WebElementFacade model_A6;

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[4]/div[1]/button")
    public
    WebElementFacade series_drop_down;

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[4]/div[1]/div/ul/li[2]/a")
    public
    WebElementFacade any_series;


    @FindBy(name = "login-button")
    public
    WebElementFacade nextStepButton;




    public void selectSeries() {
        series_drop_down.click();
        any_series.click();
    }

    public void clickNextStepButton() {
        nextStepButton.waitUntilClickable().click();
    }

    public void selectModelA6() {
        model_drop_down.click();
        model_A6.click();
    }
}
