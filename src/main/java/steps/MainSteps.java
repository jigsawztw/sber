package steps;
import pages.MainPage;
import org.junit.*;
import io.qameta.allure.Step;
public class MainSteps {

    @Step("навели мышкой на меню")
    public void selectMainMenu(){
        new MainPage().selectMainMenu();
    }
    @Step("выбрали подменю  - {name}")
    public void selectcategorie(String name){
        new MainPage().selectcategorie(name);
    }
    @Step("нажали кнопку Рассчитать")
    public void clickCalculate(){
        new MainPage().clickCalculate();
    }

}
