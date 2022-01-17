package com.joinassemby.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.joinassembly.pagemethods.InterComMethods;

public class InterCom {
	
	public static void main(String args[]) throws InterruptedException
	{
	 
	  System.setProperty("webdriver.driver.chromedriver","./chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  InterComMethods icom = new InterComMethods(driver) ;
	  driver.get("https://www.joinassembly.com/");
	  driver.manage().window().maximize();
	  WebDriverWait wait  = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.visibilityOf(icom.loginButton));
	  icom.clickloginButton();
	  wait.until(ExpectedConditions.visibilityOf(icom.interCom));
	  icom.clickInterCom();

	  int size = driver.findElements(By.tagName("iframe")).size();
	  System.out.println(size);
      

	  wait.until(ExpectedConditions.visibilityOf(icom.chatArea));
	  icom.enterMessage("Hello");
	  icom.clickSendButton();
      wait.until(ExpectedConditions.visibilityOfAllElements(icom.responseText));
	  icom.getResponse();
	  

	}
	
	
	

}
