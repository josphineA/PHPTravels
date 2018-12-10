package com.phpqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.phpqa.base.BaseClass;

public class HotelResultsPage extends BaseClass{
	
	public HotelResultsPage(){
		PageFactory.initElements(driver, this);

	}
	
	public void filterSearch() throws InterruptedException {
		
		try {
		System.out.println("Apply filter search criteria...");

		//WebElement search= driver.findElement(By.xpath("//span[contains(.,'select2-chosen')]")).getText();
		
		WebElement search = driver.findElement(By.className("select2-input"));
		search.sendKeys("Oasis Beach Tower");
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
}
