package DecisionAutom;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateMerchantTest extends BaseTest {

    @Test(dataProvider = "merchDataProvider")
   // @Ignore
    public void fillMerchantRequest(String LastName, String FirstName, String SecondName) throws Exception {
        System.out.println(LastName);
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Merchant_Registration/Merchant_Registration.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        //driver.wait(10000);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_surname_TextBox")).sendKeys(LastName);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_firstname_TextBox")).sendKeys(FirstName);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_middlename_TextBox")).sendKeys(SecondName);
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

    @Test
    @Ignore
    public void submitMerchantRequest() throws Exception {
        driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Market_Admin/Merchant_requests/Registration_requests.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
        driver.findElement(By.id("UserName")).click();
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("UserName")).sendKeys("s");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("s");
        driver.findElement(By.xpath("//form[@action='/PluginWebapp/Login.aspx/LoginUser']")).click();
        driver.findElement(By.xpath("//button[@id='LoginButton']/span")).click();
        //driver.findElement(By.xpath("//href[contains(text(), 'Заявки на рассмотрение')]")).click();
        //driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Market_Admin/Merchant_requests/Registration_requests.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
    }
    @DataProvider
    public Object[][] merchDataProvider() throws FileNotFoundException {
        String path = "D:/Telesens/SKMaven/test data/FIO.csv";
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new FileInputStream(path), StandardCharsets.UTF_8);
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
            lines.add(nextLine);
        }
        scanner.close();
        Object [][] data = new Object[lines.size()][3];
        for (int i = 0; i < lines.size(); i++) {
            String[] lineParts = lines.get(i).split(",");
            System.arraycopy(lineParts, 0, data[i], 0, lineParts.length);
            // Обычный способ
//            for (int j = 0; j < lineParts.length; j++) {
//                data[i][j] = lineParts[j];
//            }
        }
        return data;
    }




}
