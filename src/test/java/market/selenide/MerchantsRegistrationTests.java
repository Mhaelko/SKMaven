package market.selenide;

import com.codeborne.selenide.Configuration;
import market.selenide.page.MerchantRegistrationPage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class MerchantsRegistrationTests {
    @BeforeClass
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://devcloud.turnkey-lender.com/PluginWebapp/Merchant_Registration/Merchant_Registration.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef";
        Configuration.startMaximized = true;
       // Configuration.timeout = 10;

    }

    @Test//(dataProvider = "merchDataProvider")
    //@Ignore
    public void fillMerchantRequest() {
                new MerchantRegistrationPage()
                        .goToPage()
                        .fillFirstName("Ntcn")
                        .fillSecondName("qqqq")
                        .fillLastName("cvvcxvcx")
                        .fillbirthDate("10/10/2000");

    }

    @AfterClass
    public void tearDown(){
        //closeWindow();
    }


}
