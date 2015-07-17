package CarWant.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by semashko on 7/7/2015.
 */
@DefaultUrl("http://carwant.apache.devplatform1.com/site/login")

public class LoginPage extends PageObject {

    WebDriver driver;

    @FindBy(name = "login-button")
    WebElement sign_in;

    @FindBy(id = "loginform-email")
    WebElement login;

    @FindBy(id = "loginform-password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div")
    public
    WebElement emptyLoginWarning;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div")
    public
    WebElement incorrectLoginWarning;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div")
    public WebElement invalidLoginWarning;

    @FindBy(linkText = "Reset it here")
    public WebElement resetPasswordLink;

    public void clickSignIn() {
        sign_in.click();
    }

    public void setUserName(String strUserName) {
        login.sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    //Click on login button
   /* public HomePage clickSignIn() {
        sign_in.click();
        return new HomePage(driver);
    }*/

    public void loginToCarWant(String strUserName, String strPasword) {
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
    }

    public void waitForWarning() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement emptyLoginWarning = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[1]/div")));

    }

    public void waitForIncorrectEmailWarning() {
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement incorrectLoginWarning = wait1.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[2]/div")));

    }
}

