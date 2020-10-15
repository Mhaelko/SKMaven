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

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")
    private WebElement region;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox")
    private WebElement city;

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
        region.click();
        region.findElement(By.xpath(String.format(divTemplate,Region))).click();
        return this;
    }

    public MerchantRegistrationPage fillCity(String City){
        city.click();
        city.findElement(By.xpath(String.format(divTemplate,City))).click();
        return this;
    }

    public MerchantRegistrationPage goToPage(){
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Merchant_Registration/Merchant_Registration.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        return this;
    }
}
