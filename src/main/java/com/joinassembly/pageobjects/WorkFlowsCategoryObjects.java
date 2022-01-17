package com.joinassembly.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkFlowsCategoryObjects {
	
public WebDriver driver;
	
	

	public WorkFlowsCategoryObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//a[text()='Workflows']")
	public WebElement workFlowsButton;
	
	@FindBy(xpath="//a[@class='template-category-wrapper w-inline-block']")
	public List<WebElement> categoryList;
	
	@FindBy(xpath="//a[@class='card template-page w-inline-block']")
	public List<WebElement> featuredContent;
		
	@FindBy(xpath="//div[@class='integrations-categories-grid w-dyn-items']")
	protected WebElement featureList;
	
	@FindBy(xpath="//div[text()='Featured']")
	protected WebElement featuredCategory;

}
