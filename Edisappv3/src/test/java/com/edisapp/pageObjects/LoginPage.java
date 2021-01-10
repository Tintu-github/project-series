package com.edisapp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtUserName")
	@CacheLookup
	WebElement txtUser;
	
	@FindBy(id="basic-addon2")
	@CacheLookup
	WebElement arrow;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPass;
	
	@FindBy(id="basic-addon3")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUser.sendKeys(uname);
	}
	
	public void next()
	{
		arrow.click();
	}
	
	public void setPassword(String pwd)
	{
		txtPass.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
}
