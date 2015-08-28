package CarWant.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by semashko on 7/22/2015.
 */
public class CongratulationPage extends PageObject {

    WebDriver driver;

    @FindBy(linkText = "Continue")
    public
    WebElement continue_button;

    @FindBy(linkText = "Resend Email")
    WebElement resend_email_button;

    @FindBy(className = "title")
    public
    WebElement congratulation_text;

    @FindBy(className = "panel-title")
    public
    WebElement panel_title;



    public CongratulationPage(){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public HomePage click_continue(){
        continue_button.click();
        return new HomePage();
    }

    public void click_resend_email(){
        resend_email_button.click();
    }

}
