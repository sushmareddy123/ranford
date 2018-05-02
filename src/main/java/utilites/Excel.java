package utilites;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel 
{
    public static String folderPath="D:\\sindhu1\\Ranford_Automation_03-11-2015\\TestData\\";
	public static Workbook objWorkbook;
	public static Sheet objSheet;
	
	//connection setup to excel
	public static void setExcelConnection(String fileName)
	{
	   try {
		   objWorkbook=Workbook.getWorkbook(new File(folderPath+fileName));
	} catch (BiffException | IOException e) {
		e.printStackTrace();
	}	   	   
	}
	
	//get sheet
	public static void selectSheet(String sheetName)
	{
		objSheet=objWorkbook.getSheet(sheetName);
	}

	//get data from sheet
	public static String getCellData(int colNumber,int rowNumber)
	{
		return  objSheet.getCell(colNumber,rowNumber).getContents();
	}
	

	//get Row Count
	public static int getRowCount()
	{
		return  objSheet.getRows();
	}
	

	
	
}
