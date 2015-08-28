package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 8/28/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/buy-wizard/second")
public class BuyCarSecond extends PageObject{

    @FindBy(name = "login-button")
    WebElement sign_in;

    @FindBy(id = "loginform-email")
    WebElement login;

    @FindBy(id = "loginform-password")
    WebElement password;

    public void loginToCarWant(String name, String pass) {
        login.sendKeys(name);
        password.sendKeys(pass);
        sign_in.click();
    }
}
