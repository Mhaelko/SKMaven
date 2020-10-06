package DecisionAutom;
        import java.time.Duration;
        import java.util.regex.Pattern;
        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.annotations.*;
        import static org.testng.Assert.*;
        import org.openqa.selenium.*;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.Select;

public class CreateMerchantTest {
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
    public void fillMerchantRequest() throws Exception {
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Merchant_Registration/Merchant_Registration.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        //driver.wait(10000);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")).sendKeys("ТестФамилия");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")).sendKeys("ТестИмя");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")).sendKeys("ТестОтчество");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Республика Алтай')]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Азов')]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_Label")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")).sendKeys("ТестАдрес");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_type_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Продавец')]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_LEOrIP_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Физическое лицо')]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_OrgType_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'ФЛП')]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")).sendKeys("ТестМагаз");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_mobilephone_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_mobilephone_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_mobilephone_TextBox")).sendKeys("111111111");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")).sendKeys("test@test.test");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_description_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_description_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_description_TextBox")).sendKeys("Тест о бизнесе");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Agreement_Inner")).click();
       // driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_send_request_Inner")).click();
       // driver.findElement(By.xpath("//body[@id='ctl00_Body']/div[2]")).click();
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
