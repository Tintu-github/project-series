package MDS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class booking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mds.indusmis.in/Account/Login?ReturnUrl=%2F");
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector("#Username")).sendKeys("out1");
		driver.findElement(By.id("Password")).sendKeys("out1");
		driver.findElement(By.xpath("//input[@class='btn loginBtn']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//a[@class='gn-icon gn-icon-menu']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'Enrollement')]")).click();
		driver.findElement(By.linkText("From Enquiry")).click();
		//input data
		
		driver.findElement(By.xpath("//input[@class='form-button button green right']")).click();
	
		
	}

}
