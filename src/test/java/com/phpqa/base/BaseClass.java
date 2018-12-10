package com.phpqa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {

		public static WebDriver driver;
		public WebDriverWait wait;

		
		public static WebDriver getDriver() {
			return driver;
		}

			
		 public static void driverInitialization() {

			  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver\\chromedriver.exe");
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--start-maximized");
			  options.addArguments("--disable-notifications");		          
			  driver = new ChromeDriver(options);	

		  }
	}