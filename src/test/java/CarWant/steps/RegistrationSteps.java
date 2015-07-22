package CarWant.steps;

import CarWant.pages.HomePage;
import CarWant.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by semashko on 7/22/2015.
 */
public class RegistrationSteps extends ScenarioSteps {

    RegistrationPage registrationPage;
    HomePage homePage;

    @Step
    public void on_the_registration_page(){
        registrationPage.open();
    }

    @Step
    public void
}
