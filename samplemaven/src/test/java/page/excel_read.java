package page;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_read {
	public static void main(String[] args) throws IOException {
		String prjpath = System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook("/home/labuser/Desktop/royxl.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int x= sheet.getPhysicalNumberOfRows();
		
		System.out.println(x);
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
	}

}
