package steps;

import java.util.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.TestProperties;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;

public class BaseSteps{
    protected static WebDriver driver;
    protected static String baseUrl;
    public static Properties properties =  TestProperties.getInstance().getProperties();


    @Before
    public static void setUp() throws Exception{
        String s = properties.getProperty("browser");
        if (s.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
            driver = new FirefoxDriver();

        } else if (s.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        }
        baseUrl = properties.getProperty("url");
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, java.util.concurrent.TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public static void tearDown() throws Exception{
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

