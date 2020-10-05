package DecisionAutom;
        import java.util.regex.Pattern;
        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.chrome.ChromeDriver;
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
    public void testUntitledTestCase() throws Exception {
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
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")).sendKeys("Ленинградская область");

//        Select cbRegion = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")));
//        cbRegion.selectByVisibleText("Ленинградская область");
//        driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
//        driver.findElement(By.xpath("//div[@id='dx-b5639145-ea3b-8a57-c3d3-151ba82aa59c']/div/div/div/div[2]/div[8]/div")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBoxContainer")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
        driver.findElement(By.xpath("//div[@id='dx-e11e231a-a92a-5d04-5a28-15a7db2b6ca8']/div/div/div/div[2]/div[12]/div")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_Label")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")).sendKeys("ТестАдрес");
        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
        driver.findElement(By.xpath("//div[@id='dx-264a96a9-8a79-15d1-77b8-34287a7e4851']/div/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("//div[@id='dx-04404957-da54-83b7-6130-85ba3c451966']/div/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_type_Label")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
        driver.findElement(By.xpath("//div[@id='dx-264a96a9-8a79-15d1-77b8-34287a7e4851']/div/div/div/div[2]/div[2]/div")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[13]")).click();
        driver.findElement(By.xpath("//div[@id='dx-41c2bd99-7988-7c6a-654e-726ac31afcaf']/div/div/div/div[2]/div/div")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")).sendKeys("ТестМагаз");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_mobilephone_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")).sendKeys("test@test.test");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_description_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_description_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_description_TextBox")).sendKeys("Тест о бизнесе");
        driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Agreement_Inner']/div/div/span[2]")).click();
       // driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_send_request_Inner")).click();
       // driver.findElement(By.xpath("//body[@id='ctl00_Body']/div[2]")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }



}
