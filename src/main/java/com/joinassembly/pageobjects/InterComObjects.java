package com.joinassembly.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterComObjects {
	
	public WebDriver driver;
	
	

	public InterComObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="login-header-button")
	public WebElement loginButton;
	
	@FindBy(xpath="//div[@class='intercom-lightweight-app-launcher intercom-launcher']")
	public WebElement interCom;
	
//	@FindBy(xpath="")
	
	@FindBy(xpath="//span[text()='Send us a message']")
	public WebElement sendUSMsg;
	
	//@FindBy(xpath="//textarea[@name='message']")
	@FindBy(xpath="//textarea[@name='message']")
	public WebElement chatArea;
	
	@FindBy(xpath="//button[@class='intercom-composer-send-button intercom-1vny8sd e50zdj18']")
	protected WebElement sendButton;
	
	@FindBy(xpath="//div[@class='intercom-comment intercom-1nkieut e1en7ww91']")
	public List<WebElement> responseText;
	
	@FindBy(xpath="//div[@class='intercom-messenger-frame intercom-1d87wj3 ed8ycz90']")
	public WebElement frameObject;
	
	
	

}
