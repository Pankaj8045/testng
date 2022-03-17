package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
 
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
 
public class Transformer implements IAnnotationTransformer {
 
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
 String curgroup;
    Test reqannotation = testMethod.getAnnotation(Test.class);
         // System.out.println("groups..."+ reqannotation.groups()[0]);
    if(reqannotation.groups().length>0) {

    	curgroup = reqannotation.groups()[0];
    	}else {

    	curgroup = "nogroup";
    	}

          
        String scenariotorun[] = null;
try {
scenariotorun = getScenarioList();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
         
          List<String> list = Arrays.asList(scenariotorun);
 
        if(list.contains(curgroup)) {
            System.out.println("contains the scenario");
        }else {
        annotation.setEnabled(false);
        }
          
          
          
    }
    
 public String[] getScenarioList() throws IOException{
 
String excelSheetPath = "D:\\Users\\F978DHP\\Documents\\Testing.xlsx";
String sheetName = "Hotcard";
DataFormatter formatter = new DataFormatter();
String[] scenariolist = null;
FileInputStream fileInputStream= new FileInputStream(excelSheetPath); //Excel sheet file location get mentioned here
XSSFWorkbook workbook = new XSSFWorkbook (fileInputStream); //get my workbook
XSSFSheet worksheet=workbook.getSheet(sheetName);// get my sheet from workbook
XSSFRow row = worksheet.getRow(0);
int lastRowIndex = worksheet.getLastRowNum();
System.out.println("Last row index :" + lastRowIndex);       
    for (int j = 0; j <= lastRowIndex; j++) {     
    XSSFRow row1 = worksheet.getRow(j);
                XSSFCell c = row1.getCell(0);
                String cellData = formatter.formatCellValue(c);
                System.out.println("cell value is ---- " + cellData);
               if(cellData.equalsIgnoreCase("scenario")) {                
               XSSFCell s = row1.getCell(1);
               String reqdata = formatter.formatCellValue(s);
               //System.out.println("requird scenarios are ---- " + reqdata);
               scenariolist = reqdata.split(";");                              
               break;
               }                 
            }
workbook.close(); 
return scenariolist;
}
 
  
    }

