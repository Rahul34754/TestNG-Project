package customUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReader {
	Workbook wb;
	Sheet sheet;
	Row row;

	public XlReader(String SheetPath) throws IOException {
		FileInputStream fis = new FileInputStream(SheetPath);

		wb = new XSSFWorkbook(fis);
	}

	public int getRowcount(String Sheet_Name) {
		sheet = wb.getSheet(Sheet_Name);
		int lastRow = sheet.getLastRowNum();
		int FirstRow = sheet.getFirstRowNum();
		int ttlRows = lastRow + 1;
		return ttlRows;
	}

	public int getcolcount() {
		row = sheet.getRow(0);
		int lastCellNum = row.getLastCellNum();
		return lastCellNum;
	}

	public String getCellData(int r, int c) {
		String cellData = sheet.getRow(r).getCell(c).getStringCellValue();
		return cellData;
	}
	/*
	 * public static void main(String[] args) throws IOException { String SheetPath
	 * = System.getProperty("user.dir") + "\\src\\testData\\TestData.xlsx"; XlReader
	 * xlr = new XlReader(SheetPath); int rcount = xlr.getRowcount("Login");
	 * 
	 * int ccount = xlr.getcolcount();
	 * 
	 * for (int i = 0; i < rcount; i++) { for (int j = 0; j < ccount; j++) { String
	 * CellValue = xlr.getCellData(i, j); System.out.println(CellValue); }
	 * System.out.println(); }
	 * 
	 * }
	 */

}
