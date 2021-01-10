package MDS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class enquiry {

	public static void main(String[] args) throws InterruptedException, IOException {
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://mds.indusmis.in/Account/Login?ReturnUrl=%2F");
		   Thread.sleep(1000);	
		   driver.findElement(By.cssSelector("#Username")).sendKeys("out1");
			  
			driver.findElement(By.id("Password")).sendKeys("out1");
			
			driver.findElement(By.xpath("//input[@class='btn loginBtn']")).click();
			  Thread.sleep(1000);	
			  
			  driver.findElement(By.xpath("//a[@class='gn-icon gn-icon-menu']")).click();
	   		    Thread.sleep(1000);
			    driver.findElement(By.xpath("//h1[contains(text(),'Enquiry')]")) .click();
			    driver.findElement(By.linkText("New Enquiry")).click();
			  
		   FileInputStream file=new FileInputStream("E:\\TINTU\\2019-20\\software issues\\mobile app\\data.xlsx");
		    
		    //get workbook instance for xlsx file
		    XSSFWorkbook workbook=new XSSFWorkbook(file);
		    XSSFSheet sheet=workbook.getSheet("testdata");
		   
		    int noofrow= sheet.getLastRowNum();
		    System.out.println("no of rows are "+ noofrow);
		    
		      
		    for (int i = 1; i < noofrow; i++)
		    {
				XSSFRow currentrow=sheet.getRow(i);
				System.out.println(i);
				String CustName=currentrow.getCell(2).getStringCellValue();
				String Resaddr=currentrow.getCell(18).getStringCellValue();
				String loc=currentrow.getCell(16).getStringCellValue();
				String pin=currentrow.getCell(26).getStringCellValue();
				String ph=currentrow.getCell(25).getStringCellValue();
				String email=currentrow.getCell(22).getStringCellValue();
		   		      		  
		   
		    //entry start
				
		    driver.findElement(By.id("trnBDCustName")).sendKeys(CustName);
		    driver.findElement(By.id("trnBDCustCompany")).sendKeys("individual");
		    driver.findElement(By.id("trnBDCustAddress")).sendKeys(Resaddr);
		    Select state=new Select( driver.findElement(By.id("stateID")));
		    state.selectByVisibleText("Kerala");
		    driver.findElement(By.id("trnBDCustOccupation")).sendKeys("private");
		    driver.findElement(By.id("trnBDLocation")).sendKeys(loc);
		    Select district=new Select( driver.findElement(By.name("trnBDDistrict")));
		    district.selectByVisibleText("Ernakulam");
		    driver.findElement(By.id("trnBDCustPIN")).sendKeys(pin);
		    Select area=new Select( driver.findElement(By.name("trnBDAreaCode")));
		    area.selectByVisibleText("Kalamasserry");
		    Thread.sleep(500);
		    Select village=new Select( driver.findElement(By.id("VillageID")));
		    village.selectByIndex(5);
		    driver.findElement(By.id("trnBDCustOffPhone")).sendKeys(ph);
		    driver.findElement(By.id("trnBDCustResPhone")).sendKeys(ph);
		    driver.findElement(By.id("trnBDCustMobile")).sendKeys(ph);
		    driver.findElement(By.id("trnBDCustEmail")).sendKeys(email);
		    Select course=new Select( driver.findElement(By.name("trnBDCourseType")));
		    course.selectByVisibleText("Basic");
		    driver.findElement(By.xpath("//input[@id='trnBDJoiningDate']")).click();
		    Select month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		    month.selectByIndex(3);
		    driver.findElement(By.linkText("21")).click();
		    driver.findElement(By.xpath("//input[@id='save']")).click();
	}

	}
}
