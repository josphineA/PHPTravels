package com.phpqa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PHPFlightsPage {

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
		
		
		WebElement flightstab= driver.findElement(By.xpath("//span[contains(text(),'Flights  ')]"));
		flightstab.click();
		
		WebElement flightfrom= driver.findElement(By.xpath("//input[@id='s2id_location_from']"));
		flightfrom.sendKeys("Bali Airport");
		
//		WebElement flightfrom= driver.findElement(By.id("select2-drop-mask"));
//		flightfrom.sendKeys("Bali Airport");
		
		WebElement flightto= driver.findElement(By.id("select2-drop"));
		flightto.sendKeys("Kuala Lumpur");
		//htlsearch.sendKeys(Keys.Tab);
		//WebElement.sendKeys(Keys.RETURN);
		
		WebElement indate= driver.findElement(By.name("checkin"));
		String dateVal1="13/12/2018";
		
		selectDateByJS1(driver,indate,dateVal1);
		
		WebElement outdate= driver.findElement(By.name("checkout"));
		String dateVal2="15/12/2018";
		
		selectDateByJS1(driver,outdate,dateVal2);
		
		WebElement travellers= driver.findElement(By.name("travellers"));
		travellers.click();
		
		WebElement adultsno= driver.findElement(By.name("adults"));
		adultsno.sendKeys("2");
		
		WebElement childno= driver.findElement(By.name("child"));
		childno.sendKeys("2");
					
		WebElement searchbtn= driver.findElement(By.xpath("//*[contains(@class,'btn-block')]"));
		searchbtn.click();
		
		System.out.println("Completed");
		
		HotelResultsPage htlrslt=new HotelResultsPage();
		htlrslt.filterSearch();
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
