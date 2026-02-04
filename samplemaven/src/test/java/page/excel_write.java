package page;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_write {
	public static void main(String[] args) throws IOException {
		String prjpath = System.getProperty("user.dir");
		
		FileInputStream fis = new FileInputStream("/home/labuser/Desktop/royxl.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		sheet.createRow(1).createCell(2).setCellValue("FAIL");
		
		FileOutputStream fout= new FileOutputStream("/home/labuser/Desktop/royxl.xlsx");
		wb.write(fout);
		wb.close();
		
	}

}
