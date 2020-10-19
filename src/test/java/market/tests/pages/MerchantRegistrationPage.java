package market.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MerchantRegistrationPage extends BasePage{
    private String divTemplate = "//div[contains(text(), '%s')]";

    //Обязательно!!!
    public MerchantRegistrationPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")
    private WebElement lastName;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")
    private WebElement firstName;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")
    private WebElement secondName;

    @FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_DOB_TextBox']//input[@type='text']")
    private WebElement birthDate;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_Gender_ComboBox")
    private WebElement sex;

    //@FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")
    @FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox']//input[@name='Merch_region']/following::input[@role='combobox']")
    private WebElement region;

    //@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox']//input[@name='Merch_city']/following-sibling::div/input")
    @FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox']")
    private WebElement city;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_street_TextBox")
    private WebElement address;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_type_ComboBox")
    private WebElement merchType;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_LEOrIP_ComboBox")
    private WebElement leOrIP;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_OrgType_ComboBox")
    private WebElement orgType;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_nameRU_TextBox")
    private WebElement nameRU;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_mobilephone_TextBox")
    private WebElement mobilephone;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_email_TextBox")
    private WebElement email;

    @FindBy(name="Merch_description")
    private WebElement merchDescription;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Agreement_Inner")
    private WebElement agreement;

    public MerchantRegistrationPage fillLastName(String LastName){
        fillTextField(lastName,LastName);
        return this;
    }
    public MerchantRegistrationPage fillFirstName(String FirstName){
        firstName.clear();
        firstName.sendKeys(FirstName);
        return this;
    }
    public MerchantRegistrationPage fillSecondName(String SecondName){
        secondName.clear();
        secondName.sendKeys(SecondName);
        return this;
    }

    public MerchantRegistrationPage fillbirthDate(String BirthDate){
        birthDate.clear();
        birthDate.sendKeys(BirthDate);
        return this;
    }

    public MerchantRegistrationPage fillSex(String Sex){
        sex.click();
        sex.findElement(By.xpath(String.format(divTemplate,Sex))).click();
        return this;
    }

    public MerchantRegistrationPage fillRegion(String Region){
        region.clear();
        region.sendKeys(Region);
        //region.findElement(By.xpath("//input[@name=\"Merch_region\"]/following::input[@role='combobox']")).clear();
        //region.findElement(By.xpath("//input[@name=\"Merch_region\"]/following::input[@role='combobox']")).sendKeys(Region);
        //div[@id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_SelectContainer"]//input[@role='combobox']
        region.findElement(By.xpath(String.format(divTemplate,Region))).click();
        return this;
    }

    public MerchantRegistrationPage fillCity(String City){
        city.findElement(By.xpath("//input[@name='Merch_city']/following-sibling::div/input")).clear();
        city.findElement(By.xpath("//input[@name='Merch_city']/following-sibling::div/input")).sendKeys(City);
        //city.click();
        city.findElement(By.xpath(String.format(divTemplate,City))).click();
        return this;
    }

    public MerchantRegistrationPage fillAddress(String address){
        this.address.clear();
        this.address.sendKeys(address);
        return this;
    }

    public MerchantRegistrationPage fillMerchType(String merchType){
        this.merchType.click();
        this.merchType.findElement(By.xpath(String.format(divTemplate,merchType))).click();
        return this;
    }

    public MerchantRegistrationPage fillLeOrIP(String leOrIP){
        this.leOrIP.click();
        this.leOrIP.findElement(By.xpath(String.format(divTemplate,leOrIP))).click();
        return this;
    }

    public MerchantRegistrationPage fillOrgType(String orgType){
        this.orgType.click();
        this.orgType.findElement(By.xpath(String.format(divTemplate,orgType))).click();
        return this;
    }

    public MerchantRegistrationPage fillNameRU(String nameRU){
        this.nameRU.click();
        this.nameRU.clear();
        this.nameRU.sendKeys(nameRU);
        return this;
    }

    public MerchantRegistrationPage fillMobilephone(Double mobilephone){
        this.mobilephone.click();
        this.mobilephone.clear();
        this.mobilephone.sendKeys(Double.toString(mobilephone));
        return this;
    }

    public MerchantRegistrationPage fillEmail(String email){
        this.email.click();
        this.email.clear();
        this.email.sendKeys(email);
        return this;
    }

    public MerchantRegistrationPage fillMerchantDescription(String merchDescription){
        this.merchDescription.click();
        this.merchDescription.clear();
        this.merchDescription.sendKeys(merchDescription);
        return this;
    }

    public MerchantRegistrationPage fillAgreement(){
        this.agreement.click();
        return this;
    }

    public MerchantRegistrationPage goToPage(){
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Merchant_Registration/Merchant_Registration.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        return this;
    }
}
