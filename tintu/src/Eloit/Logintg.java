package Eloit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintg {
  @Test
  public void login() throws InterruptedException {
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
  }
}
