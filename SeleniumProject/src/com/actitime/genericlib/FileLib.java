package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author deepak
 *
 */
public class FileLib {

	/**
	 * read the data from Properties File based on key 
	 * @param key
	 * @return value of the Key
	 * @throws Throwable
	 */
	public String getPropertyFileData(String key) throws Throwable {

		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		
		return value;
	}
	
	/**
	 * its used to read the data from "/data/testScripts.xlsx" Excel Sheet based on user argument
	 * 
	 * @param sheetNAme, rowNum , celNUM
	 * @return String data
	 * @throws Throwable
	 */
	public String getExcelData(String sheetNAme, int rowNum, int celNum) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("./data/testScritpData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		return data;	
	}
	/**
	 * used to write data back to ExcelSheet based on user arguments
	 * @param sheetName,rowNum,celNum,data
	 */
   public void setExcelData(String sheetName, int rowNum, int celNum ,String data) throws Throwable, IOException {
	   FileInputStream fis = new FileInputStream("./data/testScritpData.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
       Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/testScritpData.xlsx");
		wb.write(fos);
		wb.close();
   }

}










