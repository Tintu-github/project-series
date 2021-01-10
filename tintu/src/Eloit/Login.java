package Eloit;

import java.sql.Driver;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Value; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class Login {

	public static void main(String[] args) throws InterruptedException {
	
 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 String baseUrl="https://e3-qa.azurewebsites.net/";
 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.get(baseUrl);
 
 driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("support@eloit.com");
 driver.findElement(By.xpath("//span[@id='basic-addon2']")).click();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Eloit123!");
 driver.findElement(By.xpath("//span[@id='basic-addon3']")).click();
 System.out.println("login Successfully");
 
 //student
 driver.findElement(By.xpath("//span[@class='menu-text']")).click();
 //create student
 driver.findElement(By.xpath("//span[contains(text(),'Create Students')]")).click();
 driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Juliet");
 driver.findElement(By.xpath("//input[@id='AdmissionNumber']")).sendKeys("123");
 
 //select gender
 driver.findElement(By.xpath("//span[@class='k-input'][normalize-space()='-Select-']")).click();
 //select list and count data in drop down
java.util.List<WebElement>genderList= driver.findElements(By.xpath("//div[@class='k-list-scroller']//ul[@id='Gender_listbox']//li"));
System.out.println("count of gender list " + genderList.size());

for (int i = 0; i < genderList.size(); i++) {
	System.out.println(genderList.get(i).getText());
	if (genderList.get(i).getText().contains("Male")) {
	    genderList.get(i).click();
	    break;
	}	
	
}

 /*driver.findElement(By.xpath("//span[@aria-controls='DateOfBirth_dateview']//span[@class='k-icon k-i-calendar']")).click();
 driver.findElement(By.linkText("December 2020")).click();
 WebElement month= driver.findElement(By.xpath("//a[contains(text(),Jul)]"));
 if (month.isSelected())
 {
	 driver.findElement(By.cssSelector("a[title='22 July 2020']"));
 }
 */
 
 driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
 
 WebElement IsFatherStaff= driver.findElement(By.cssSelector("label[for='IsFatherStaff']"));
 IsFatherStaff.click();
 
 	driver.findElement(By.xpath("//div[@id='FatherStaffSelect']//span[@class='k-input'][normalize-space()='-Select-']")).click();
	java.util.List<WebElement>fatherStaff=driver.findElements(By.xpath("//div[@id=\"FatherStaffId-list\"]//ul//li"));
	System.out.println("count of father list " + fatherStaff.size());

	for (int i = 0; i < fatherStaff.size(); i++) {
		System.out.println(fatherStaff.get(i).getText());
		if (fatherStaff.get(i).getText().contains("GAGAN")) {
			fatherStaff.get(i).click();
		    break;
		}	
		 	
	}
		
 //driver.findElement(By.id("FatherName")).sendKeys("James");

 driver.findElement(By.xpath("//span[@class='k-input'][contains(text(),'--Select--')]")).click();
 java.util.List<WebElement>categoryList= driver.findElements(By.xpath("//div[@class='k-list-scroller']//ul[@id='StudentCategoryId_listbox']//li"));
 System.out.println("count of Category list " + categoryList.size());

 for (int i = 0; i < categoryList.size(); i++) {
 	System.out.println(categoryList.get(i).getText());
 	if (categoryList.get(i).getText().contains("OBC")) {
 		categoryList.get(i).click();
 	    break;
 	}	
 	
 }
 driver.findElement(By.xpath("//span[@class='k-input'][normalize-space()='--Select--']")).click();
 java.util.List<WebElement>classList= driver.findElements(By.xpath("//div[@class='k-list-scroller']//ul[@id='ClassId_listbox']//li"));
 System.out.println("count of division list " + classList.size());

 for (int i = 0; i < classList.size(); i++) {
 	System.out.println(classList.get(i).getText());
 	if (classList.get(i).getText().contains("I DAISY")) {
 		classList.get(i).click();
 	    break;
 	}	
 	
 }
 driver.findElement(By.id("FatherMobile")).sendKeys("1111111111");
 driver.findElement(By.id("MotherName")).sendKeys("Mary");
 driver.findElement(By.id("MotherMobile")).sendKeys("1111111111");


 

 
 
/*
{
	System.out.println("Father is not staff");
}*/

}
}