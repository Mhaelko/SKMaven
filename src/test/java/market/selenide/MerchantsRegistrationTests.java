package market.selenide;

import Base.BaseTest;
import Base.TestListener;
import com.codeborne.selenide.Configuration;
import com.fasterxml.jackson.databind.ser.Serializers;
import market.selenide.page.MerchantRegistrationPage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

@Listeners(TestListener.class)
public class MerchantsRegistrationTests extends BaseTest {
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
                        .fillLastName("Тестик")
                        .fillFirstName("Тест")
                        .fillSecondName("Тестович")
                        .fillbirthDate("10/10/2000");

    }

    @AfterClass
    public void tearDown(){
        //closeWindow();
    }


}
