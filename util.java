package Util;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class util {
public Object[][] getExcelData(String excelSheetPath, String sheetName) throws IOException{

Object[][] Data = null;
DataFormatter formatter = new DataFormatter();
FileInputStream fileInputStream= new FileInputStream(excelSheetPath); //Excel sheet file location get mentioned here

XSSFWorkbook workbook = new XSSFWorkbook (fileInputStream); //get my workbook
XSSFSheet worksheet=workbook.getSheet(sheetName);// get my sheet from workbook

XSSFRow row = worksheet.getRow(0);
int lastRowIndex = worksheet.getLastRowNum();
System.out.println("Last row index :" + lastRowIndex);
int totalNoOfCols = row.getLastCellNum() - 1;
System.out.println("Total columns :" + totalNoOfCols);
Data = new Object[totalNoOfCols][lastRowIndex];

for (int i = 1; i <= totalNoOfCols ; i++) {
for (int j = 0; j < lastRowIndex; j++) {
row = worksheet.getRow(j+1);
XSSFCell c = row.getCell(i);
String cellData = formatter.formatCellValue(c);
System.out.println(cellData);
Data[i-1][j] = cellData;
}
System.out.println("-----------");
}

workbook.close();

return Data;
}
}
