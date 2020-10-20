package market.tests;

import Base.BaseTest;
import market.tests.pages.LoginPage;
import market.tests.pages.MerchantRegistrationPage;
import market.tests.pages.RegistrationRequestsPage;
import okhttp3.Address;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MerchantsRegistrationTests extends BaseTest {
    @Test(dataProvider = "merchDataProvider")
    @Ignore
    public void fillMerchantRequest(String lastname, String firstname, String secondname,
                                    String birthdate,String sex, String region,
                                    String city,String address, String merchtype,
                                    String leorip,String orgtype, String nameru,
                                    Double mobilephone, String email, String merchdescription) {
        MerchantRegistrationPage merchantRegistrationPage = new MerchantRegistrationPage(driver)
                .goToPage()
                .fillLastName(lastname)
                .fillFirstName(firstname)
                .fillSecondName(secondname)
                .fillbirthDate(birthdate)
                .fillSex(sex)
                .fillRegion(region)
                .fillCity(city)
                .fillAddress(address)
                .fillMerchType(merchtype)
                .fillLeOrIP(leorip)
                .fillOrgType(orgtype)
                .fillNameRU(nameru)
                .fillMobilephone(mobilephone)
                .fillEmail(email)
                .fillMerchantDescription(merchdescription)
                .fillAgreement()
                ;
    }

    @Test
    //@Ignore
    public void userLogin(){
        LoginPage loginPage = new LoginPage(driver)
                .goToPage()
                .fillLogin("s")
                .fillPassword("s")
                .buttonClick();
        RegistrationRequestsPage registrationRequestsPage = new RegistrationRequestsPage(driver)
                .goToPage()
                .fillgridFilter("Тест Тест Тест")
                ;
    }
    @DataProvider
    public Object[][] merchDataProvider() throws IOException {
        String path = this.path + "test data/Merchants data.xlsx";
        FileInputStream is = new FileInputStream(path);
        //BufferedReader fr = new BufferedReader(path, StandardCharsets.UTF_8);
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
                if(cell.getCellType() == CellType.NUMERIC) {
//                    if(DateUtil.isCellDateFormatted(cell)){
//                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//                        String tempBDate = cell.getStringCellValue();
//                        String pDate = format.format(tempBDate);
//                        data[i - 1][j] = pDate;
//                    }
                    data[i - 1][j] = cell.getNumericCellValue();
                }
                else
                    data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
}
