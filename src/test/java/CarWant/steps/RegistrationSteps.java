package CarWant.steps;

import CarWant.pages.CongratulationPage;
import CarWant.pages.HomePage;
import CarWant.pages.LoginPage;
import CarWant.pages.RegistrationPage;
import CarWantDB.DataBase;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by semashko on 7/22/2015.
 */
public class RegistrationSteps extends ScenarioSteps {

    RegistrationPage registrationPage;
    HomePage homePage;
    CongratulationPage congratulationPage;
    LoginPage loginPage;

    @Step
    public void on_the_registration_page(){
        registrationPage.open();
    }

    @Step
    public void select_private_or_dealer(String role){
        registrationPage.select_role(role);
    }

    @Step
    public void select_title(String title){
        registrationPage.select_title(title);
    }

    @Step
    public void inputFirstName(String first_name){
        registrationPage.setRegistration_first_name(first_name);
    }

    @Step
    public void inputLastName(String last_name){
        registrationPage.setRegistration_last_name(last_name);
    }

    @Step
    public void inputEmail(String email){
        registrationPage.setRegistration_email(email);
    }

    @Step
    public void confirmEmail(String email){
        registrationPage.setRegistration_confirm_email(email);
    }

    @Step
    public void inputPassword(String password){
        registrationPage.setRegistration_password(password);
    }

    @Step
    public void confirmPassword(String password){
        registrationPage.setRegistration_confirm_password(password);
    }

    @Step
    public void clickSignUpButton(){
        registrationPage.signUp();
    }

    @Step
    public void GoToTheCongratulationPageAndClickContinue()  {
        //System.out.print(congratulationPage.continue_button.getText());
        //Assert.assertTrue(congratulationPage.continue_button.isDisplayed());
        congratulationPage.click_continue();
    }


    public void goToTheLoginPage() {
        loginPage.open();
    }

    public void login(String email, String password) {
        loginPage.setUserName(email);
        loginPage.setPassword(password);
        loginPage.login();
    }

//    public void shouldSeeTheFirstNameInHeader(String zhenya) {
//        Assert.assertTrue(homePage.user_name.getText().contains(zhenya));
//    }

    @Step
    public void deleteUserFromBD(String registration_email){
        DataBase.deleteUser(registration_email);
    }

    @Step
    public void confirmRegisteredUser(String registration_email){
        DataBase.confirmUser(registration_email);
    }

//    public void onTheHomePage() {
//        Assert.assertTrue(homePage.video_block.isDisplayed());
//    }
}
