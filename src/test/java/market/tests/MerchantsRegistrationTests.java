package market.tests;

import Base.BaseTest;
import market.tests.pages.MerchantRegistrationPage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class MerchantsRegistrationTests extends BaseTest {
    @Test(dataProvider = "merchDataProvider")
    //@Ignore
    public void fillMerchantRequest(String LastName, String FirstName, String SecondName,String BirthDate,String Sex, String Region, String City) {
        MerchantRegistrationPage merchantRegistrationPage = new MerchantRegistrationPage(driver)
                .goToPage()
                .fillLastName(LastName)
                .fillFirstName(FirstName)
                .fillSecondName(SecondName)
                .fillbirthDate(BirthDate)
                .fillSex(Sex)
                .fillRegion(Region)
                .fillCity(City);
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
    }
}
