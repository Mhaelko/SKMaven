package market.selenide.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MerchantRegistrationPage {
    private String divTemplate = "//div[contains(text(), '%s')]";

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")
    private SelenideElement lastName;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")
    private SelenideElement firstName;

    @FindBy(id="ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")
    private SelenideElement secondName;

    @FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_DOB_TextBox']//input[@type='text']")
    private SelenideElement birthDate;
    @Step("Вводим Фамилию {0}")
    public MerchantRegistrationPage fillLastName(String LastName){
        fillTextField(lastName,LastName);
        return page(MerchantRegistrationPage.class);
    }
    @Step("Вводим Имя {0}")
    public MerchantRegistrationPage fillFirstName(String FirstName){
        fillTextField(firstName,FirstName);
        return page(MerchantRegistrationPage.class);
    }
    @Step("Вводим Отчество {0}")
    public MerchantRegistrationPage fillSecondName(String SecondName){
        fillTextField(secondName,SecondName);
        return page(MerchantRegistrationPage.class);
    }
    @Step("Вводим дату рождения {0}")
    public MerchantRegistrationPage fillbirthDate(String BirthDate){
        fillTextField(birthDate,BirthDate);
        return page(MerchantRegistrationPage.class);
    }
    public MerchantRegistrationPage goToPage(){
        open("https://devcloud.turnkey-lender.com/PluginWebapp/Merchant_Registration/Merchant_Registration.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        return page(MerchantRegistrationPage.class);
    }
    protected void fillTextField(SelenideElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}
