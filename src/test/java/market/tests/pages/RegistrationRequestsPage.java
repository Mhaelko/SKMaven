package market.tests.pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationRequestsPage extends BasePage {

    public RegistrationRequestsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Registration_request_DPGroupBox6_RequestsGB_Inner']")
    private WebElement grid;

    @FindBy(xpath="//div[@title='Apply filter']")
    private WebElement gridFilterButton;

    @FindBy(xpath="//td[@aria-label='Column ФИО, Filter cell']//div[@class='dx-texteditor-container']//input")
    private WebElement gridFilter;

    public RegistrationRequestsPage fillgridFilter(String fio){
        gridFilter.click();
        gridFilter.sendKeys(fio);
        gridFilterButton.click();
        return this;
    }

    public RegistrationRequestsPage goToPage(){
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Market_Admin/Merchant_requests/Registration_requests.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        return this;
    }
}
