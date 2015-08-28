package CarWant.steps;

import CarWant.pages.HomePage;
import CarWant.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by semashko on 7/7/2015.
 */
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    HomePage homePage;
    WebDriver driver;

    @Step
    public void shouldGoToTheHomePageAndSeeGetStartedLink(){
        homePage.assertIsOpened();
    }

    @Step
    public void onTheLoginPage(){
        loginPage.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void enterCredentials(String email, String password){
        loginPage.loginToCarWant(email, password);
    }
    
    @Step
    public void signIn(){
        loginPage.login();
    }

    @Step
    public void shouldSeeTheWarningInvalidEmailMessage(String warningText) {
        assertEquals(warningText, loginPage.invalidLoginWarning.getText());
    }

    @Step
    public void shouldSeeTheWarningBlankEmailMessage(String warningText) {
        assertEquals(warningText, loginPage.emptyLoginWarning.getText());
    }

    @Step
    public void shouldSeeTheWarningIncorrectEmailMessage(String warningText) {
        assertEquals(warningText, loginPage.incorrectLoginWarning.getText());
    }

    @Step
    public void shouldSeeTheLogoutLink() {
        homePage.assertLogoutIsDisplayed();
    }
}
