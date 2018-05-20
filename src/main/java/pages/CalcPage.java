package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import  org.junit.*;
import java.util.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
public class CalcPage  extends BasePage{
    public CalcPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        BaseSteps.getDriver().manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        WebElement select = (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.xpath("//input[@class='dcCalc_textfield__input']")));
    }
    @FindBy(xpath = "//h1")
    WebElement title;

    @FindBy(xpath = "//input[@id='estateCost']")
    WebElement estateCost;

    @FindBy(xpath = "//input[@class='dcCalc_textfield__input']")
    WebElement select;


    @FindBy(xpath = "//*[text()='Покупка квартиры в новостройке']")
    WebElement buy_new_house;


    @FindBy(xpath = "//input[@id='initialFee']")
    WebElement initialFee;

    @FindBy(xpath = "//input[@id='creditTerm']")
    WebElement creditTerm;




    @FindBy(xpath = "//span[@class='dcCalc_switch__control']")
    List<WebElement> boxes;


    @FindBy(xpath = "//span[@data-test-id='amountOfCredit']")
    WebElement summa;

    @FindBy(xpath = "//span[@data-test-id='monthlyPayment']")
    WebElement monthlyPayment;

    @FindBy(xpath = "//span[@data-test-id='rate']")
    WebElement percentage;

    @FindBy(xpath = "//span[@data-test-id='requiredIncome']")
    WebElement requiredIncome;



    public void checkTitle(String name){
        Assert.assertEquals("Заголовки не совпадают",name,  title.getText());
    }

    public void selectCreditReason(String valueOfOption){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
        wait.until(ExpectedConditions.visibilityOf(select));
      wait.until(ExpectedConditions.elementToBeClickable(select)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buy_new_house)).click();

    }

    public void selectEastCost(String value){
        fillField(estateCost,value);

    }

    public void selectInitialFree(String value){
        wait.until(ExpectedConditions.textToBe(org.openqa.selenium.By.xpath("//span[@data-test-id='amountOfCredit']"), "5 000 000 \u20BD"));
        wait.until(ExpectedConditions.visibilityOf(initialFee));
        fillField(initialFee,value);

    }

    public void selectCreditTerm(String value){
        fillField(creditTerm,value);
    }

    public void selectCheckBoxes(){

       for(int i=0;i<boxes.size();i++){
           if(i%2==1||i==1){
               boxes.get(i).click();
               try{
                   Thread.sleep(1000);
               }
               catch (InterruptedException e){}
           }
       }
        }

    public void checkSumm(String sum){
        wait.until(ExpectedConditions.visibilityOf(summa));
        Assert.assertEquals("фактическая сумма кредита не соответствует ожидаемой",sum, summa.getText());
    }
    public void checkMonthlyPayment(String payment){
        wait.until(ExpectedConditions.visibilityOf(monthlyPayment));
        Assert.assertEquals("Фактическое значение ежемесячного платежа не соответствует ожидаемому", payment, monthlyPayment.getText());
    }
    public void checkRate(String rate){
        wait.until(ExpectedConditions.visibilityOf(percentage));
        Assert.assertEquals("Фактическая ставка не соответствует ожидаемой",rate , percentage.getText());
    }
    public void checkRequiredIncome(String income){
        wait.until(ExpectedConditions.visibilityOf(requiredIncome));
        Assert.assertEquals("Фактический необходимый доход не соответствует ожидаемому",income , requiredIncome.getText());
    }

}
