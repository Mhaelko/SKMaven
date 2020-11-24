package Base;

import LESS.Lesson11.FileReaderDemo;
import LESS.Lesson12.LoggerDemo;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

abstract public class BaseTest {
    protected EventFiringWebDriver driver;
    protected String path;
    private StringBuffer verificationErrors = new StringBuffer();
    private static Logger LOG = LogManager.getLogger(BaseTest.class.getName());

    @Parameters({"browser","path"})
    @BeforeClass(alwaysRun = true)
    public void setUp (@Optional("chrome") String browser, @Optional("less") String ipath) throws Exception {

        Properties properties = new Properties();
        try(InputStream is = BaseTest.class.getClassLoader().getResourceAsStream("decision.properties")) {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(ipath.equals("less")){
            path = properties.getProperty("less.path");

        } else if (ipath.equals("home")){
            path = properties.getProperty("home.path");
        }
        else{
            path = properties.getProperty("home.path");
        }
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", path +"drivers/chromedriver.exe");
            driver = new EventFiringWebDriver(new ChromeDriver());
        } else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", path+"drivers/geckodriver.exe");
            driver = new EventFiringWebDriver(new FirefoxDriver());
        }
        else{
            System.setProperty("webdriver.chrome.driver", path +"drivers/chromedriver.exe");
            driver = new EventFiringWebDriver(new ChromeDriver());
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.register(new WebDriverEventListenerImplementation(path + "/test results/screenshots"));
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        //driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @BeforeMethod
    public void testStart(Method method, Object[] params){
        LOG.info("Test {} started with parameters: {}", method.getName(), Arrays.toString(params));
    }
    @AfterMethod
    public void testEnd(Method method, Object[] params){
        LOG.info("Test {} finished ", method.getName());
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshotPNG () {
        return driver.getScreenshotAs(OutputType.BYTES);
    }
}
