package market.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id="UserName")
    private WebElement login;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(xpath="//button[@id='LoginButton']/span")
    private WebElement button;

    public LoginPage fillLogin(String login){
        this.login.click();
        this.login.clear();
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage fillPassword(String password){
        this.password.click();
        this.password.clear();
        this.password.sendKeys(password);
        return this;
    }

    public LoginPage buttonClick(){
        this.button.click();
        return this;
    }

    public LoginPage goToPage(){
        driver.get("https://devcloud.turnkey-lender.com/pluginwebapp/Login.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        return this;
    }
}
