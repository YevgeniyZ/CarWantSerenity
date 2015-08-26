package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 7/7/2015.
 */

@DefaultUrl("http://carwant.apache.devplatform1.com")
public class HomePage extends PageObject {


    @FindBy(linkText = "Get Started")
    public
    WebElementFacade get_started_link;

    @FindBy(linkText = "Logout")
    public
    WebElementFacade logout_link;


    public void assertIsOpened() {
        Assert.assertEquals("Get Started", get_started_link.getText());
    }

    public void assertLogoutIsDisplayed() {
        System.out.println(logout_link.getText());
        Assert.assertEquals("Logout",logout_link.getText());
    }
}
