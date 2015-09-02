package CarWant;

import CarWant.pages.HomePage;
import CarWant.pages.LoginPage;
import CarWant.steps.BuyCarSteps;
import CarWant.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by semashko on 8/27/2015.
 */
@RunWith(SerenityRunner.class)
public class BuyCarTest {

    @Managed
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @Steps
    public BuyCarSteps user;
    public LoginSteps unregistered_user;



    @Test
    public void BuyCarFlowPositive() throws InterruptedException {
        //Given
        user.onTheHomePage();
        //When
        user.clickIWantToBuyACar();
        user.selectMakeAudi();
        user.clickNextStepButton1();
        user.login();
        user.selectMakeAudi();
        user.clickNextStepButton1();
        user.selectModelA6();
        user.selectSeries();
        user.clickNextStepButton3();
        user.clickNextStepButton4();
        user.clickNextStepButton5();
        user.clickNextStepButton6();
        user.clickSubmitForFreeButton();
        user.clckMyDashboardButton();
        //Then
        //Then
        user.shouldSeeTheSelectedCarInDashboard();

    }

    @After
    public void deleteCreatedBuyCar(){
        user.clickDelete();
    }
}
