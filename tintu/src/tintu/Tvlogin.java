package tintu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;//

public class Tvlogin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tv.indusmis.in/Account/Login?ReturnUrl=%2F");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("ho");
	driver.findElement(By.id("Password")).sendKeys("admin#835tv");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"company-selection\"]/input")).click();
	String expitile="Home Page - INDUS TRUE VALUE";
	String acttitle=driver.getTitle();
	System.out.println(driver.getTitle());
	if (expitile.equals(acttitle)==true) {
		System.out.println("test passed");
	}
		else {
			System.out.println("test failed");
		}
    Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"gn-menu\"]/li/a")).click();
	Thread.sleep(1000);
    driver.findElement(By.tagName("h1")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Closing Stock")).click();
	Thread.sleep(3000);
	driver.close();

	}

}
