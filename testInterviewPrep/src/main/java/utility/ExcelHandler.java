package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler {

 public static String readData(String sheetName, int row, int column)  {
        FileInputStream fis=null;
     try {
         File f = new File("src/main/resources/data/TestData.xlsx");
         fis = new FileInputStream(f);
     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     }
     XSSFWorkbook xssfWorkbook=null;
     try {
        xssfWorkbook = new XSSFWorkbook(fis);
     } catch (RuntimeException | IOException e) {
         throw new RuntimeException(e);
     }
     XSSFSheet sheet=xssfWorkbook.getSheet(sheetName);
     return sheet.getRow(row).getCell(column).getStringCellValue();

 }
}
