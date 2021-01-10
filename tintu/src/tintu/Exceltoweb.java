package tintu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exceltoweb {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		   
	     
			driver.findElement(By.cssSelector("#Username")).sendKeys(id);
		  
			driver.findElement(By.id("Password")).sendKeys(password);
			
			driver.findElement(By.xpath("//input[@class='btn loginBtn']")).click();
			  Thread.sleep(1000);	
    		driver.findElement(By.xpath("//a[@class='gn-icon gn-icon-menu']")).click();
    		Thread.sleep(1000);
		    driver.findElement(By.xpath("//h1[contains(text(),'Purchase')]")) .click();
		    driver.findElement(By.linkText("Sourcing")).click();
		    
		    //calendar selection-month and date only
		   driver.findElement(By.xpath("//input[@id='FromDate']")).click();
		   Select m=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		   System.out.println(m);
		 
		   m.selectByVisibleText("Feb");
		   driver.findElement(By.linkText("1")).click();
		   		   
		   driver.findElement(By.xpath("//input[@class='form-button button green right']")).click();
		   Thread.sleep(500);
		   driver.findElement(By.cssSelector("div.container-fluid.body-content:nth-child(2) div.content-fix div.form-section.form-section-grid div.table-responsive div.col-md-12:nth-child(2) table.table.form-grid.clear.fixTable tbody:nth-child(2) tr:nth-child(1) td:nth-child(4) a:nth-child(1) > b:nth-child(1)")).click();
		  
		   //sourcing sheet entry
		   driver.findElement(By.name("srcDate")).click();
		   driver.findElement(By.linkText("20")).click();
		   
		   Select cat=new Select(driver.findElement(By.name("srcVcCode")));
		   cat.selectByIndex(1);
		   
		   Select typ=new Select(driver.findElement(By.name("srcStCode")));
		   typ.selectByIndex(0);
		   
		   driver.findElement(By.name("srcRegNo")).sendKeys("KL07R6644");
		   
		   Select make=new Select(driver.findElement(By.name("srcMkeCode")));
		   make.selectByVisibleText("MARUTI");
		   
		   Select fuel=new Select(driver.findElement(By.name("srcFtCode")));
		   fuel.selectByVisibleText("Petrol");
		   
		   driver.findElement(By.name("srcChassisNo")).sendKeys(String.valueOf(1234556));
		   driver.findElement(By.name("srcTotKm")).sendKeys(String.valueOf(1234556));
		   
		   Select model=new Select(driver.findElement(By.name("srcMdlCode")));
		   model.selectByVisibleText("M 800 STD");
		   
		   driver.findElement(By.name("srcEngNo")).sendKeys(String.valueOf(1234556));
		   
		   Select yom=new Select(driver.findElement(By.name("srcYomCode")));
		   yom.selectByVisibleText("1997");
		   
		   
    }
              
   
	}
	
    }
