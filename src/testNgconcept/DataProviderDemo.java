package testNgconcept;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import customUtility.XlReader;

public class DataProviderDemo {
	
	
	
 
	public  String[][] readData() throws IOException {
		String SheetPath = System.getProperty("user.dir") + "\\src\\testData\\TestData.xlsx";
		XlReader xlr = new XlReader(SheetPath);
		int rcount = xlr.getRowcount("Login");

		int ccount = xlr.getcolcount();
		
		String[][] dataArr = new String[rcount-1][ccount];

		for (int i = 1; i < rcount; i++) {
			for (int j = 0; j < ccount; j++) {
				
			dataArr [i-1][j] = xlr.getCellData(i, j);
				
			}
		 
		}
		return dataArr;
		/*
		 * @Test(dataProvider="readData") // public void n(String username ,String
		 * password) { // System.out.println(username+""+password); //}
		 */	}
}
