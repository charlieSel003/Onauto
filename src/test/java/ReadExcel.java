import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readExcel() throws Exception {
		File f = new File("C:\\Users\\Kitty\\Desktop\\demo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		sh.getRow(1).createCell(3).setCellValue("kesavan");
		sh.getRow(2).createCell(3).setCellValue("karthik");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}
