import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlutilities {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public xlutilities(String filepath) {
		File name=new File(filepath);
				try {
					FileInputStream  stream=new FileInputStream(filepath);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				try {
					workbook=new XSSFWorkbook(filepath);
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	public String method1(int sheetnumber,int rownumber,int cell) {
		workbook.getSheetAt(sheetnumber);
		String data=sheet.getRow(rownumber).getCell(cell).getStringCellValue();
		return data;
	}
		public int getRowCount(int sheetIndex) {
			
		int row=workbook.getSheetAt(sheetIndex).getLastRowNum();
		return sheetIndex;
			
		}
		
	}
	

