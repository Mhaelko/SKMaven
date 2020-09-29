package LESS.Lesson11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo {
    public static void main (String[] args) {
        String path = "d:/tmp/Files/table.xlsx";
        try(FileInputStream is = new FileInputStream(path)){
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet("sheet-demo");
            Row row = sheet.getRow(0);
            Cell cell1 = row.getCell(0);
            Cell cell2 = row.getCell(1);

            System.out.println(cell1.getStringCellValue());
            System.out.println(cell2.getNumericCellValue());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
