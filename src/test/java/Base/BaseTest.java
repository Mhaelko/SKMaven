package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BaseTest {
    protected WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp (@Optional("chrome") String browser) throws Exception {
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:/Telesens/SKMaven/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "D:/Telesens/SKMaven/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", "D:/Telesens/SKMaven/drivers/chromedriver.exe");
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
