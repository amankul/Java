package main.Selenium.ListenAndRerun;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    //This method is to set the File path and to open the Excel file
    //Pass Excel Path and SheetName as Arguments to this method
    public static void setExcelFile(String Path) throws Exception {
        FileInputStream ExcelFile = new FileInputStream(Path);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheetAt(0);

    }

    //This method is to read the test data from the Excel cell
    //In this we are passing parameters/arguments as Row Num and Col Num
    public static String getCellData(int RowNum, int ColNum) throws Exception{

        try {

            String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue().toString();

            return CellData;
        }
        catch(Exception e){
     //       System.out.println("Exception for row: " + RowNum +  " and column: " +  ColNum);
            return "";
            }


    }

    private static void writeToCell(int row,int column, String toWrite) {

ExcelWSheet.getRow(row).getCell(column).setCellValue(toWrite);

//        ExcelWSheet.getRow(row).createCell(column).setCellValue(toWrite);
    }


    public static void main(String[] args) throws Exception {
    // Declaring the path of the Excel file with the name of the Excel file
    String sPath = System.getProperty("user.dir")  + "/src/main/resources/Wifi_Carrier_Targeting.xls";

    // Here we are passing the Excel path and SheetName as arguments to connect with Excel file
    ExcelUtils.setExcelFile(sPath);

    System.out.println("No of rows " + ExcelWSheet.getLastRowNum() + " No of sheets " + ExcelWBook.getNumberOfSheets());

    for (int iRow = ExcelWSheet.getFirstRowNum(); iRow <= ExcelWSheet.getLastRowNum(); iRow++) {
      String sActionKeyword = ExcelUtils.getCellData(iRow, 4) + " " + getCellData(iRow,5);
      if (sActionKeyword != null || sActionKeyword.isEmpty() )
      System.out.println(sActionKeyword);
    }

    writeToCell(4,4,"Programatic");


}

}





/*
Below mentioned are some of the interfaces of POI.

XSSFWorkbook: Represents workbook in xlsx file.
HSSFWorkbook: Represents workbook in xls file.
XSSFSheet: Represents a sheet in XLSX file.
HSSFSheet: Represents a sheet in XLS file.
XSSFRow: Represents a row in a sheet of XLSX file.
HSSFRow: Represents a row in a sheet of XLS file.
XSSFCell: Represents a cell in a row of XLSX file.
HSSFCell: Represents a cell in a row of XLS file.
Fields available in a cell:

CELL_TYPE_BLANK: Represents a blank cell.
CELL_TYPE_BOOLEAN: Represents a Boolean cell (true or false).
CELL_TYPE_ERROR: Represents an error value in a cell.
CELL_TYPE_FORMULA: Represents a formula result on a cell.
CELL_TYPE_NUMERIC: Represents numeric data in a cell.
CELL_TYPE_STRING: Represents string in a cell.

Keyword driven approach

UI test(AUT switch case)
|
|
TestExecutor -> Excel utils(path,sheet) -> File
|
|
Object reader -> Object repo

*/


