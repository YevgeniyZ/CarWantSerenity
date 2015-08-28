package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by semashko on 7/7/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/site/login")

public class LoginPage extends PageObject {


    @FindBy(name = "login-button")
    WebElement sign_in;

    @FindBy(id = "loginform-email")
    WebElement login;

    @FindBy(id = "loginform-password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div")
    public WebElement emptyLoginWarning;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div")
    public WebElement incorrectLoginWarning;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div")
    public WebElement invalidLoginWarning;

    @FindBy(linkText = "Reset it here")
    public WebElement resetPasswordLink;


    public void setUserName(String strUserName) {
        login.sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    public void loginToCarWant(String strUserName, String strPasword) {
        //Fill user name
        setUserName(strUserName);
        //Fill password
        setPassword(strPasword);
        //
    }

    public void login(){
        sign_in.click();
    }
}

