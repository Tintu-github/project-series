package com.edisapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edisapp.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.next();
		lp.setPassword(password);
		lp.clickSubmit();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Login - Edisapp 3.0"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
