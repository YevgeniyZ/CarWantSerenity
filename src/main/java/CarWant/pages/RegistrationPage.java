package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by semashko on 7/7/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/site/register")

public class RegistrationPage extends PageObject{

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"select-sign-action\"]/div[1]/label")
    WebElement login_checkbox;

    @FindBy(xpath = "//*[@id=\"select-sign-action\"]/div[2]/label")
    WebElement registration_checkbox;

    @FindBy(xpath = "//*[@id=\"signup-form\"]/div[1]/div[1]/div")
    public WebElement private_or_dealer_dropdown;

    @FindBy(xpath = "//*[@id=\"signup-form\"]/div[3]/div/div[1]/button")
    WebElement title_drpdown;

    @FindBy(id = "signupform-firstname")
    WebElement registration_first_name;

    @FindBy(id = "signupform-lastname")
    WebElement registration_last_name;

    @FindBy(id = "signupform-email")
    WebElement registration_email;

    @FindBy(id = "signupform-confirmemail")
    WebElement registration_confirm_email;

    @FindBy(id = "signupform-password")
    WebElement registration_password;

    @FindBy(id = "signupform-confirmpassword")
    WebElement registration_confirm_password;

    @FindBy(name = "signup-button")
    WebElement signup_button;

    @FindBy(linkText = "terms")
    WebElement link_terms;

    @FindBy(linkText = "privacy policy")
    WebElement privacy_policy_link;

    @FindBy(name = "login-button")
    WebElement sign_in;

    @FindBy(id = "loginform-email")
    WebElement login;

    @FindBy(id = "loginform-password")
    WebElement password;

    public CongratulationPage signUp(){
        signup_button.click();
        return new CongratulationPage();
    }

    public void select_role(String role){
        Select drop = new Select(private_or_dealer_dropdown);
        drop.selectByVisibleText(role);
    };

    public void select_title(String title){
        Select drop = new Select(title_drpdown);
        drop.selectByVisibleText(title);
    };

    public void setRegistration_first_name(String first_name){
        registration_first_name.sendKeys(first_name);
    }

    public void setRegistration_last_name(String last_name){
        registration_last_name.sendKeys(last_name);
    }

    public void setRegistration_email(String email){
        registration_email.sendKeys(email);
    }

    public void setRegistration_confirm_email(String email){
        registration_confirm_email.sendKeys(email);
    }

    public void setRegistration_password(String password){
        registration_password.sendKeys(password);
    }

    public void setRegistration_confirm_password(String confirm_password){
        registration_confirm_password.sendKeys(confirm_password);
    }



}
