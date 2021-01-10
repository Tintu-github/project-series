package tintu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;


public class Datadriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\TINTU\\2019-20\\TV\\contacts.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//XSSFSheet sheet=workbook.getSheet("Sheet2"); //providing sheet name
		XSSFSheet sheet=workbook.getSheetAt(2); //providing sheet no
 
		int rowcount=sheet.getLastRowNum();//return row no
		
		int colcount=sheet.getRow(0).getLastCellNum();//cell count
		
		for (int i = 0; i < rowcount; i++)
		{
		XSSFRow currentrow=sheet.getRow(i);//current row	
			
		for (int j=0;j <colcount;j++)
		 {
			String value=currentrow.getCell(j).toString();//read value from cell
			
			System.out.print("  " + value);
		
		 }
		
		System.out.println();
		}
		
	}

}
