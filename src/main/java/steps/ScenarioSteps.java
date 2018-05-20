package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    CalcSteps calcSteps = new CalcSteps();


    @When("Выбрали меню")
    public void selectMainMenu(){
        mainSteps.selectMainMenu();
    }
    @When("^Выбрали подменю -  \"(.+)\"$")
    public void selectcategorie(String name){
        mainSteps.selectcategorie(name);
    }
    @Then("Нажали кнопку рассчитать")
    public void clickCalculate(){
        mainSteps.clickCalculate();
    }
    @Then("^Проверили заголовок страницы -  \"(.+)\"$")
    public void checkTitle(String titleName){
        calcSteps.checkTitle(titleName);
    }
    @Then("^Выбрали цель кредита -  \"(.+)\"$")
    public void selectCreditReason(String value){
        calcSteps.selectCreditReason(value);
    }
    @Then("^Установили стоимость недвижимости -  \"(.+)\"$")
    public void selectEastCost(String value){
        calcSteps.selectEastCost(value);
    }
    @Then("^Установили первоначальный взнос -  \"(.+)\"$")
    public void selectInitialFree(String value){
        calcSteps.selectInitialFree(value);
    }
    @Then("^Установили срок -  \"(.+)\"$")
    public void selectCreditTerm(String value){
        calcSteps.selectCreditTerm(value);
    }
    @Then("^Установили чекбоксы")
    public void selectCheckBoxes(){
        calcSteps.selectCheckBoxes();
    }
    @Then("^Проверили сумму кредита -  \"(.+)\"$")
    public void checkSumm(String value){
        calcSteps.checkSumm(value);
    }
    @Then("^Проверили ставку кредита -  \"(.+)\"$")
    public void checkRate(String rate){
        calcSteps.checkRate(rate);
    }
    @Then("^Проверили ежемесячный платеж -  \"(.+)\"$")
    public void checkMonthlyPayment(String value){
        calcSteps.checkMonthlyPayment(value);
    }
    @Then("^Проверили необходимый доход -  \"(.+)\"$")
    public void checkRequiredIncome(String value){
        calcSteps.checkRequiredIncome(value);
    }

}
