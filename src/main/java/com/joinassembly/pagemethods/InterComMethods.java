package com.joinassembly.pagemethods;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.joinassembly.pageobjects.InterComObjects;

public class InterComMethods extends InterComObjects{

	public InterComMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	public void clickInterCom()
	{
		interCom.click();
	}
	
	public boolean isSendUSMsgDisplayed() 
	{
		try {
			sendUSMsg.isDisplayed();
			return true;
		}
		
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	
	public void clickSendUSMsg()
	{
		sendUSMsg.click();
	}

	
	public void enterMessage(String message)
	{
		//chatArea.sendKeys(message);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Hello'", chatArea);
	}
	
	public void clickSendButton()
	{
		sendButton.click();		
	}
	
	public void getResponse()
	{
		for(WebElement e: responseText)
		{
			System.out.println(e.getText());
		}
	}


}
