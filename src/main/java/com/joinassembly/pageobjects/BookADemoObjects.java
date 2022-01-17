package com.joinassembly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookADemoObjects {
	
public WebDriver driver;
	
	

	public BookADemoObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(id="demo-header-button")
	public WebElement bookADemoButton;
	
	@FindBy(xpath="//iframe[contains(@src, 'meetings')]")
	public WebElement iframeForMEetings;
	
	@FindBy(xpath="//span[text()='30 mins']")
    public WebElement demoTimePeriod;
	
	@FindBy(xpath="//div[@class='p-y-1 p-right-1'][1]")
	protected WebElement timeSlot;
	
	@FindBy(name="firstName")
	public WebElement firstName;
	
	@FindBy(name="lastName")
	protected WebElement lastName;
	
	@FindBy(name="email")
	protected WebElement emailAddress;
	
	@FindBy(name="company")
	protected WebElement companyName;
	
	@FindBy(name="phone")
	protected WebElement phoneNumber;
	
	@FindBy(name="chat_application")
	protected WebElement selectCommunication;
	
	@FindBy(xpath="//i18n-string[text()='Confirm']")
	protected WebElement confirmButton;
	
	@FindBy(xpath="//img[contains(@src, 'success')]")
	public WebElement successImg;
	
	
	
	
	
	
	
	
	
	
	

}
