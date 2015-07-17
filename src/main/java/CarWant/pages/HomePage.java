package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by semashko on 7/7/2015.
 */

@DefaultUrl("http://carwant.apache.devplatform1.com")
public class HomePage extends PageObject {

    WebDriver driver;

    @FindBy(id="w2")
    public WebElement nav_bar;

    public HomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
}
