package tintu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestAssert {
  @Test
  public void facebook() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://indusmis.in");
	  driver.manage().window().maximize();
  }
}
