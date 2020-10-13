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
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", path+"drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", path +"drivers/chromedriver.exe");
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
