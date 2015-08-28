package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
public class DashboardBuyingPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"w0\"]/div[1]/div[2]/div/div/div/div[2]/h2")
    public
    WebElementFacade request;

    @FindBy(xpath = "//*[@id=\"w0\"]/div[1]/div[2]/div/div/div/div[3]/div/div[3]/div")
    public
    WebElementFacade delete_button;

    @FindBy(xpath = "//*[@id=\"deleteRequest\"]/div[2]/div/div/div/div/div")
    public
    WebElementFacade delete_confirm;

    public void shouldSeeTheSelectedCarInDashboard(){
        System.out.println(request.getText());
        Assert.assertTrue(request.containsText("Audi A6 Any"));
    }

    public void delete() {
        delete_button.click();
        delete_confirm.waitUntilClickable().click();

    }
}

