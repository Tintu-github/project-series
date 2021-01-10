package tintu;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class Excelout {

	public static void main(String[] args) throws IOException {
 
		FileInputStream file=new FileInputStream("E:\\TINTU\\2019-20\\TV\\TrueValue SW\\tv password.xlsx");

    XSSFWorkbook workbook=new XSSFWorkbook(file);
    XSSFSheet sheet=workbook.getSheet("Sheet2");
int rowcount=sheet.getLastRowNum();
int col=sheet.getRow(2).getLastCellNum();
for (int i = 0; i < rowcount; i++) 
{
	XSSFRow currentrow= sheet.getRow(i);
	for (int j = 0; j < col; j++)
	{
		String value= currentrow.getCell(j).toString();
		
		System.out.print(" " + value );
	}
	
	System.out.println();
}


	}

}
