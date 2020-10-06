package com.ac.automation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTests {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp () throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:/Telesens/SKMaven/drivers/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "G:/Java/TS_Maven/drivers/geckodriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testInvalidEmail () throws Exception {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("username");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("password");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='center_column']/div/ol/li")).getText(), "Invalid email address.");
    }
    @Test
    public void testInvalidEmail2 () throws Exception {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("username");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("password");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='center_column']/div/ol/li")).getText(), "Invalid email address.");
    }


    @AfterClass(alwaysRun = true)
    public void tearDown () throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}

