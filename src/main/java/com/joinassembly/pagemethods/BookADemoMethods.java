package com.joinassembly.pagemethods;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.joinassembly.pageobjects.BookADemoObjects;

public class BookADemoMethods extends BookADemoObjects{

	public BookADemoMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickBookADemoButton()
	{
		bookADemoButton.click();
	}
	
	public void selectTimePeriod()
	{
		demoTimePeriod.click();
	}
	
	public void selectTimeSlot()
	{
		timeSlot.click();
	}
	
	public void enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void enteremailAddress(String email)
	{
		emailAddress.sendKeys(email);
	}
	
	public void enterCompanyName(String company)
	{
		companyName.sendKeys(company);
	}
	
	public void enterPhoneNumber(String phnum)
	{
		phoneNumber.sendKeys(phnum);
	}
	
	public void selectCommunication(String communication)
	{
		Select com = new Select(selectCommunication);
		com.selectByValue(communication);
	}
	
	public void clickConfirm()
	{
		confirmButton.click();
	}
	
	public boolean isSuccessImageDisplayed()
	{
		try {
		successImg.isDisplayed();
		return true;
		}
		
		catch(NoSuchElementException e)
		{
			return false;
		}
				
	}
	

	
	
	
	

}
