package CarWant;

import CarWant.pages.HomePage;
import CarWant.pages.LoginPage;
import CarWant.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by semashko on 7/7/2015.
 */
@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;

    LoginPage loginPage;
    HomePage homePage;

    @ManagedPages(defaultUrl = "http://carwant.apache.devplatform1.com/")
    public Pages pages;



    @Steps
    public LoginSteps user;

    @Test
    public void testValidLogin(){
        //Given
        user.onTheLoginPage();
        //When
        user.enterCredentials("yevgeniy.semashko@gmail.com", "Vishnya11");
        user.signIn();
        //Then
        user.shouldGoToTheHomePage();
    }

    @Test
    public void testInvalidEmail(){
        //Given
        user.onTheLoginPage();
        //When
        user.enterCredentials("yevgeniy.semashkogmail.com", "Vishnya11");
        //And
        user.signIn();
        //Then
        user.shouldSeeTheWarningInvalidEmailMessage("Email is not a valid email address.");
    }

    @Test
    public void testBlankEmail(){
        //Given
        user.onTheLoginPage();
        //When
        user.enterCredentials("", "Vishnya11");
        //And
        user.signIn();
        //Then
        user.shouldSeeTheWarningBlankEmailMessage("Email cannot be blank.");
    }

    @Test
    public void testIncorrectEmail(){
        //Given
        user.onTheLoginPage();
        //When
        user.enterCredentials("yevgeniy111.semashko@gmail.com", "Vishnya11");
        //And
        user.signIn();
        //Then
        user.shouldSeeTheWarningIncorrectEmailMessage("Incorrect username or password.");
    }

    @Test
    @Pending
    public void testGoToTheForgotPassword(){
        //Given
        user.onTheLoginPage();
        //When
        //user.clickOnResetPasswordLink();
        //Then
        //user.shouldGoToTheForgotPasswordPage("Incorrect username or password.");
    }
}
