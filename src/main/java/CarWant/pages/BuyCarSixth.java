package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/sixth")
public class BuyCarSixth extends PageObject {


    @FindBy(xpath = "//*[@id=\"request-form\"]/div[2]/div/div/h2")
    public
    WebElementFacade tittle;

    @FindBy(xpath = "//*[@id=\"request-form\"]/div[4]/div/div[2]/button")
    public
    WebElementFacade looksGoodButton;

    public void onPreviewPage() {
        Assert.assertEquals("Preview", tittle.getText());
    }


    public void clickNextStepButton6() {
        looksGoodButton.click();
    }
}
