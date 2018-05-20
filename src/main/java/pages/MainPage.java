package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import  org.junit.*;
import org.openqa.selenium.interactions.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
public class MainPage extends BasePage{

    @FindBy(xpath = "//a/span[@class='multiline']")
    List<WebElement> menus;

    @FindBy(xpath = "//a[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_2']")
    List<WebElement> podmenus;

    @FindBy(xpath = "//span[text()='Рассчитать']")
    WebElement rassschet;


    @FindBy(xpath = "//a[@aria-label='Раздел Взять  кредит']")
    WebElement takeCredit;
    @FindBy(xpath = "//div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row with_gutter']//h2")
    WebElement kakpol;

    @FindBy(xpath = "//h4/a[contains(text(), ' Сервис безопасных расчетов')]")
    WebElement bottom;



    public void selectMainMenu(){
                    new Actions(BaseSteps.getDriver()).moveToElement(takeCredit).perform();
            }

    public void selectcategorie(String name){
        selectCollectionItem(name, podmenus);
        }

       public void clickCalculate(){

        new Actions(BaseSteps.getDriver()).moveToElement(bottom).perform();
           wait.until(ExpectedConditions.visibilityOf(rassschet));
           wait.until(ExpectedConditions.elementToBeClickable(rassschet));
         rassschet.click();
           ArrayList tabs2 = new ArrayList (BaseSteps.getDriver().getWindowHandles());
           BaseSteps.getDriver().switchTo().window(String.valueOf(tabs2.get(1)));
        }


}


