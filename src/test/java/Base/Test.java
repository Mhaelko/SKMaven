package Base;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String path = "g:/Java/TS_Maven/test data/Merchants data.xlsx";
        try(FileInputStream is = new FileInputStream(path)){
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet("Registration");
            int lastRowNum = sheet.getLastRowNum();
            Row row = sheet.getRow(0);
            int lastCellNum = row.getLastCellNum();
            Object [][] data = new Object[lastRowNum][lastCellNum];
            for (int i = 1; i <= lastRowNum; i++) {
                row = sheet.getRow(i);
                for (int j = 0; j < lastCellNum; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell;
                    System.out.println(cell.getCellType());
                }
            }
            for (Object[] datum : data) {
                System.out.println(Arrays.toString(datum));
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
