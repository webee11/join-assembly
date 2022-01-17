package com.joinassemby.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.joinassembly.pagemethods.WorkFlowsCategoryMethods;

public class WorkFlowsCategory {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.driver.chromedriver","./chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  WorkFlowsCategoryMethods wfcm = new WorkFlowsCategoryMethods(driver) ;
		  driver.get("https://www.joinassembly.com/");
		  driver.manage().window().maximize();
		  WebDriverWait wait  = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOf(wfcm.workFlowsButton));
		  wfcm.clickWorkFlowsCategory();
		  wait.until(ExpectedConditions.visibilityOfAllElements(wfcm.categoryList));
		  wfcm.getCategoryList();
		  wfcm.clickFeatured();
		  wait.until(ExpectedConditions.visibilityOfAllElements(wfcm.featuredContent));
		  wfcm.getFeaturedContent();
		  driver.close();

	}

}
