package steps;
import pages.CalcPage;
import org.junit.*;
import io.qameta.allure.Step;
public class CalcSteps {

    @Step("Проверили что заголовок страницы  - {titleName}")
    public void checkTitle(String titleName){
        new CalcPage().checkTitle(titleName);
    }

    @Step("Выбрали цель кредита  - {value}")
    public void selectCreditReason(String value){
        new CalcPage().selectCreditReason(value);
    }
    @Step("Установили стоимость недвижимости  - {value}")
    public void selectEastCost(String value){
        new CalcPage().selectEastCost(value);
    }
    @Step("Установили первоначальный взнос  - {value}")
    public void selectInitialFree(String value){
        new CalcPage().selectInitialFree(value);
    }
    @Step("Установили срок - {value}")
    public void selectCreditTerm(String value){
        new CalcPage().selectCreditTerm(value);
    }

    @Step("Установили чекбоксы")
    public void selectCheckBoxes(){
        new CalcPage().selectCheckBoxes();
    }
    @Step("Проверили сумму кредита - {value}")
    public void checkSumm(String value){
        new CalcPage().checkSumm(value);
    }
    @Step("Проверили ставку кредита - {value}")
    public void checkRate(String value){
        new CalcPage().checkRate(value);
    }
    @Step("Проверили ежемесячный платеж - {value}")
    public void checkMonthlyPayment(String value){
        new CalcPage().checkMonthlyPayment(value);
    }
    @Step("Проверили необходимый доход - {value}")
    public void checkRequiredIncome(String value){
        new CalcPage().checkRequiredIncome(value);
    }


}
