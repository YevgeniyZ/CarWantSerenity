package CarWant;

import CarWant.pages.CongratulationPage;
import CarWant.pages.HomePage;
import CarWant.pages.RegistrationPage;
import CarWant.steps.RegistrationSteps;
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
 * Created by semashko on 7/22/2015.
 */
@RunWith(SerenityRunner.class)
public class RegistrationTest {


    @Managed
    WebDriver driver;

    RegistrationPage registrationPage;
    CongratulationPage congratulationPage;
    HomePage homePage;

    @ManagedPages(defaultUrl = "http://carwant.apache.devplatform1.com")
    public Pages pages;

    @Steps
    public RegistrationSteps unregistered_user;
    public RegistrationSteps registered_user;
    public RegistrationSteps admin;

    @Pending
    @Test
    public void testValidRegistration() {
        unregistered_user.on_the_registration_page();
        //unregistered_user.select_private_or_dealer("Private");
        //unregistered_user.select_title("Mr");
        unregistered_user.inputFirstName("Zhenya");
        unregistered_user.inputLastName("Testov");
        unregistered_user.inputEmail("jobik1@mailinator.com");
        unregistered_user.confirmEmail("jobik1@mailinator.com");
        unregistered_user.inputPassword("11111111");
        unregistered_user.confirmPassword("11111111");
        unregistered_user.clickSignUpButton();
        unregistered_user.GoToTheCongratulationPageAndClickContinue();
        //unregistered_user.onTheHomePage();
        admin.deleteUserFromBD("jobik1@mailinator.com");

    }

}
