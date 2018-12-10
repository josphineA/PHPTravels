package com.phpqa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PHPCarRental {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net/");
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		
		WebElement carstab= driver.findElement(By.xpath("//span[contains(text(),'Cars     ')]"));
		carstab.click();
		
		WebElement pickuplocation= driver.findElement(By.name("pickupLocation"));
		pickuplocation.sendKeys("Malaysia");
		
		WebElement dropofflocation= driver.findElement(By.name("dropoffLocation"));
		dropofflocation.sendKeys("Pusa");
		
		
		WebElement pickupdate= driver.findElement(By.name("pickupDate"));
		String dateVal1="13/12/2018";
		
		selectDateByJS1(driver,pickupdate,dateVal1);
		
		WebElement dropoffdate= driver.findElement(By.name("dropoffDate"));
		String dateVal2="15/12/2018";
		
		selectDateByJS1(driver,dropoffdate,dateVal2);
		
		WebElement pickuptime= driver.findElement(By.name("pickupTime"));
		pickuptime.sendKeys("03:30");
		
		WebElement dropofftime= driver.findElement(By.name("dropoffTime"));
		dropofftime.sendKeys("10:00");
		
//		WebElement carlocation= driver.findElement(By.xpath("//*[@id='s2id_carlocations']"));
//		carlocation.sendKeys("Malaysia");
		
//		WebElement searchbtn= driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]"));
//		searchbtn.click();
		
		WebElement searchbtn= driver.findElement(By.xpath("//*[contains(text(),'            Search ')]"));
		searchbtn.click();
		
		System.out.println("Completed");
		
//		
	}
	catch (Exception e) {
		e.printStackTrace();
	 	}
	}
	
	public static void selectDateByJS1(WebDriver driver,WebElement element,String dateVal1) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal1+"');", element);
	
	}
	
	public static void selectDateByJS2(WebDriver driver,WebElement element,String dateVal2) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal2+"');", element);
	
	}
}
