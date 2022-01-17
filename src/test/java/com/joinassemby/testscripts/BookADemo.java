package com.joinassemby.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.joinassembly.pagemethods.BookADemoMethods;


public class BookADemo {
	
	public static void main(String args[])
	{
	 
	  
	  System.setProperty("webdriver.driver.chromedriver","./chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  BookADemoMethods bdm = new BookADemoMethods(driver) ;
	  driver.get("https://www.joinassembly.com/");
	  driver.manage().window().maximize();
	  WebDriverWait wait  = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.visibilityOf(bdm.bookADemoButton));
	  bdm.clickBookADemoButton();
	  driver.switchTo().frame(bdm.iframeForMEetings);
	  wait.until(ExpectedConditions.visibilityOf(bdm.demoTimePeriod));
	  bdm.selectTimePeriod();
	  bdm.selectTimeSlot();
	  wait.until(ExpectedConditions.visibilityOf(bdm.firstName));
	  bdm.enterFirstName("Vimal");
	  bdm.enterLastName("Bhandari");
	  bdm.enterCompanyName("Company ABC");
	  bdm.enteremailAddress("vimal11b.vb@gmail.com");
	  bdm.selectCommunication("Slack");
	  bdm.clickConfirm();
	  wait.until(ExpectedConditions.visibilityOf(bdm.successImg));
	  SoftAssert sa= new SoftAssert();
	  if(bdm.isSuccessImageDisplayed())
	  {
		  System.out.println("Success Image Displayed");
	  }
	  else
	  {
		  System.out.println("Success Image not Displayed");
	  }


}
}
