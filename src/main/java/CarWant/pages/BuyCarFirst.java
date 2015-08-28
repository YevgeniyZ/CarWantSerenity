package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/27/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/first")
public class BuyCarFirst extends PageObject {

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[1]/div[1]/button")
    public
    WebElementFacade select_make_click;

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[1]/div[1]/div/ul/li[9]/a")
    public
    WebElementFacade choose_the_make;



    @FindBy(name = "login-button")
    public
    WebElementFacade nextStepButton;

    public void selectMakeAudi(){
        select_make_click.click();
        choose_the_make.click();
    }

    public void clickNextStepButton() {
        nextStepButton.click();
    }
}
