package market.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationRequestsPage extends BasePage{

    public RegistrationRequestsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id="UserName")
    private WebElement login;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(xpath="//button[@id='LoginButton']/span")
    private WebElement button;

    public RegistrationRequestsPage fillLogin(String login){
        this.login.click();
        this.login.clear();
        this.login.sendKeys(login);
        return this;
    }

    public RegistrationRequestsPage fillPassword(String password){
        this.password.click();
        this.password.clear();
        this.password.sendKeys(password);
        return this;
    }

    public RegistrationRequestsPage buttonClick(){
        this.button.click();
        return this;
    }

    public RegistrationRequestsPage goToPage(){
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Market_Admin/Merchant_requests/Registration_requests.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        return this;
    }
}
