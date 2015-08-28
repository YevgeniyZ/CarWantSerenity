package CarWant.steps;

import CarWant.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by semashko on 8/27/2015.
 */
public class BuyCarSteps extends ScenarioSteps{

    LoginPage loginPage;
    HomePage homePage;
    BuyCarFirst buyFirst;
    BuyCarSecond buySecond;
    BuyCarThird buyThird;
    BuyCarFourth buyFourth;
    BuyCarFifth buyFifth;
    BuyCarSixth buySixth;
    BuyCarSeventh buySeventh;

   @Step
   public void onTheLoginPage(){
       loginPage.open();
       getDriver().navigate().refresh();
   }

    @Step
    public void login(){
        buySecond.loginToCarWant("yevgeniy.semashko@gmail.com", "Vishnya11");

    }

    @Step
    public void onTheHomePage(){
        homePage.open();
    }

    @Step
    public void clickIWantToBuyACar(){
        homePage.clickIWantToBuyACar();
    }
    @Step
    public void selectMakeAudi() {
        buyFirst.selectMakeAudi();
    }

    @Step
    public void clickNextStepButton1(){
        buyFirst.clickNextStepButton();
    }

    @Step
    public void selectModelA6() throws InterruptedException {
        buyThird.selectModelA6();
        Thread.sleep(3000);
    }

    @Step
    public void selectSeries() {
        buyThird.selectSeries();
    }

    @Step
    public void clickNextStepButton3() throws InterruptedException {
        buyThird.clickNextStepButton();
        Thread.sleep(2000);

    }


    @Step
    public void clickNextStepButton4() throws InterruptedException {
        buyFourth.clickNextStepButton();
        Thread.sleep(2000);

    }

    @Step
    public void selectState() {
        buyFifth.selectState();
    }

    @Step
    public void clickNextStepButton5() throws InterruptedException {
        buyFifth.clickNextStepButton5();
        Thread.sleep(2000);

    }

    @Step
    public void onPreviewPage() {
        buySixth.onPreviewPage();
    }

    @Step
    public void clickNextStepButton6() throws InterruptedException {
        buySixth.clickNextStepButton6();
        Thread.sleep(2000);
    }


    @Step
    public void clickSubmitForFreeButton(){
        buySeventh.clickSubmitForFreeButton();
    }

    @Step
    public void shouldSeeTheSuccessPopUpSucess(){
        buySeventh.shouldSeeTheSuccessPopUpSucess();
    }
}
