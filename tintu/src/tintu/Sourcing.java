package tintu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcing {

	public static void main(String[] args) throws InterruptedException, IOException {
   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://tv.indusmis.in/Account/Login?ReturnUrl=%2F");
   //get data from excel sheet
   
   FileInputStream file=new FileInputStream("E:\\TINTU\\2019-20\\TV\\TrueValue SW\\tv password.xlsx");
   
   //get workbook instance for xlsx file
   XSSFWorkbook workbook=new XSSFWorkbook(file);
   XSSFSheet sheet=workbook.getSheet("Sheet2");
  
   int noofrow= sheet.getLastRowNum();
   System.out.println("no of rows are "+ noofrow);
   
     
   for (int i = 2; i < noofrow; i++)
   {
		XSSFRow currentrow=sheet.getRow(i);
		System.out.println(i);
		String id=currentrow.getCell(1).getStringCellValue();
		String password=currentrow.getCell(2).getStringCellValue();
		   
	     Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Username")).sendKeys(id);
		 Thread.sleep(2000);	
		driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='btn loginBtn']")).click();
        driver.findElement(By.xpath("//span[@class='fa fa-power-off']"));
	}

} 
	}
