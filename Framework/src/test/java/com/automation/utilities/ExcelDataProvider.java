package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
 public ExcelDataProvider()
	
	{
		
		File scr= new File("./TestData/AsifTESTdata.xlsx");
		
		try {
			FileInputStream FIS = new FileInputStream(scr);
			wb=new XSSFWorkbook(FIS);
			
			
		} catch (Exception e) 
		{
			
			
			
		System.out.println("Unable to Print the EXCEL "+e.getMessage());
		}
		
		
		
		
	}
	
	public String getStringdata(int sheetindex ,int rownum, int cellnum) 
	{
		
		
		return wb.getSheetAt(sheetindex).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		
		
	}
	
	
	public String getStringdata(String sheetname ,int rownum, int cellnum) 
	{
		
		
		return wb.getSheet("sheetname").getRow(rownum).getCell(cellnum).getStringCellValue();
		
		
		
	}
	
public double getNumericdata(String sheetname ,int rownum, int cellnum) 
{
	return wb.getSheet("sheetname").getRow(rownum).getCell(cellnum).getNumericCellValue();
		
		
	}
}
