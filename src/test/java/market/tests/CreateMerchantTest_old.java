package market.tests;
import Base.BaseTest;
import market.tests.pages.MerchantRegistrationPage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

public class CreateMerchantTest_old extends BaseTest {

    @Test(dataProvider = "merchDataProvider")
    @Ignore
    public void fillMerchantRequest(String LastName, String FirstName, String SecondName, String BirthDate,String Sex, String Region, String City,String Address) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(BirthDate);
        String pDate = format.format(date);
        System.out.println(pDate);
        //System.out.println(LastName);
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
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_DOB_Inner")).click();
        //driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        // driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(pDate);
        //driver.findElement(By.xpath("//*[@name='Merch_DOB']")).clear();
        //driver.findElement(By.xpath("//*[@name='Merch_DOB']")).sendKeys(pDate);
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_DOB_TextBox']//input[@type='text']")).clear();
        driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_DOB_TextBox']//input[@type='text']")).sendKeys(pDate);

        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_Gender_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Мужской')]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_region_ComboBox")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Республика Алтай')]")).click();
        //driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox")).click();
        //driver.findElement(By.xpath("//div[contains(text(), 'Азов')]")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox']//input[@name='Merch_city']/following-sibling::div/input")).clear();
        driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Merch_city_ComboBox']//input[@name='Merch_city']/following-sibling::div/input")).sendKeys("Санкт");
        //city.click();
        driver.findElement(By.xpath("//div[contains(text(), 'Санкт-Петербург')]")).click();
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
        driver.findElement(By.name("Merch_description")).click();
        driver.findElement(By.name("Merch_description")).clear();
        driver.findElement(By.name("Merch_description")).sendKeys("Тест о бизнесе");
        driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_common_info_Agreement_Inner']")).click();
        // driver.findElement(By.id("ctl00_ContentPlaceHolder1_OpenedReport1_Merchants_registration_Merch_send_request_Inner")).click();
        // driver.findElement(By.xpath("//body[@id='ctl00_Body']/div[2]")).click();
    }
    @Test(dataProvider = "merchDataProvider")
    @Ignore
    public void fillMerchantRequestUsingPage(String LastName, String FirstName, String SecondName) {
        MerchantRegistrationPage merchantRegistrationPage = new MerchantRegistrationPage(driver);
        merchantRegistrationPage.goToPage();
        merchantRegistrationPage.fillLastName(LastName);
        merchantRegistrationPage.fillFirstName(FirstName);
        merchantRegistrationPage.fillSecondName(SecondName);
    }
    @Test(dataProvider = "merchDataProvider")
    @Ignore
    public void fillMerchantRequestUsingPage2(String LastName, String FirstName, String SecondName) {
        MerchantRegistrationPage merchantRegistrationPage = new MerchantRegistrationPage(driver)
            .goToPage()
            .fillLastName(LastName)
            .fillFirstName(FirstName)
            .fillSecondName(SecondName);
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
        //driver.findElement(By.xpath("//span[contains(text(),'Заявки на рассмотрение')]")).isSelected();
        driver.findElement(By.xpath("//a[contains(@href,\"Registration_requests.aspx\")]")).click();

        //driver.get("https://devcloud.turnkey-lender.com/PluginWebapp/Market_Admin/Merchant_requests/Registration_requests.aspx?SystemClient=95941356-4c04-4bb3-afb7-fb7c2f7651ef");
    }

    @DataProvider
    public Object[][] merchDataProvider() throws IOException {
        String path = this.path + "test data/Merchants data.xlsx";
        FileInputStream is = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(is);
        Sheet sheet = workbook.getSheet("Registration");
        int lastRowNum = sheet.getLastRowNum();
        Row row = sheet.getRow(0);
        int lastCellNum = row.getLastCellNum();
        Object[][] data = new Object[lastRowNum][lastCellNum];
        for (int i = 1; i <= lastRowNum; i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < lastCellNum; j++) {
                 Cell cell = row.getCell(j);
                 data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
//      for (Object[] datum : data) {
//           System.out.println(Arrays.toString(datum));
//      }
    }

}
/*        List<String> lines = new ArrayList<>();
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

        try(FileInputStream is = new FileInputStream(path)){
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet("Registration");
            //sheet.getLastRowNum()
            Row row = sheet.getRow(0);
            Cell cell1 = row.getCell(0);
            Cell cell2 = row.getCell(1);

            System.out.println(cell1.getStringCellValue());
            System.out.println(cell2.getNumericCellValue());
        }catch (IOException e){
            e.printStackTrace();
        }


    }




}*/
