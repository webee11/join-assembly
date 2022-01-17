package com.joinassembly.pagemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.joinassembly.pageobjects.WorkFlowsCategoryObjects;

public class WorkFlowsCategoryMethods extends WorkFlowsCategoryObjects{

	public WorkFlowsCategoryMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickWorkFlowsCategory()
	{
		workFlowsButton.click();
	}
	
	public void getCategoryList()
	{ 
		
		System.out.println("----------CATEGORY LIST----------");
		for(WebElement e:categoryList)
			
			if(categoryList.size()>1)
			{
			  System.out.println(e.getText());
			}
	}
	
	public void clickFeatured()
	{
		for(WebElement e:categoryList)
		{
			
			if(categoryList.size()>1)
			{
							
				if(e.getText().equalsIgnoreCase("Featured"))
				{					
					e.click();
					break;
				}
			}
		}
	}
	
	public void getFeaturedContent()
	{
		System.out.println("----------CONTENT IN FEATURED CATEGORY----------");
		for(WebElement e:featuredContent)
		
		{
			System.out.println(e.getText());
			
		}

			
	}
	
	

}
