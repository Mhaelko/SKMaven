package Base;

import LESS.Lesson11.FileReaderDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BaseTest {
    protected WebDriver driver;
    protected String path;
    private StringBuffer verificationErrors = new StringBuffer();

    @Parameters({"browser","driverpath"})
    @BeforeClass(alwaysRun = true)
    public void setUp (@Optional("chrome") String browser, @Optional("less") String driverpath) throws Exception {

        Properties properties = new Properties();
        try(InputStream is = BaseTest.class.getClassLoader().getResourceAsStream("decision.properties")) {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(driverpath.equals("less")){
            path = properties.getProperty("driver.less.path");
        } else if (driverpath.equals("home")){
            path = properties.getProperty("driver.home.path");
        }
        else{
            path = properties.getProperty("driver.home.path");
        }
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", path +"chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", path +"chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        //driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
