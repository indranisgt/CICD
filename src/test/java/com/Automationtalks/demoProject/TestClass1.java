package com.Automationtalks.demoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Users//proba//New_workspace//demoProject//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void test1() {
		driver.navigate().to("https://www.automationtalks.com");
		System.out.println(driver.getTitle());
	}
	@Test
public void test2() {
	driver.navigate().to("https://www.automationtalks.com");
	System.out.println(driver.getTitle());
	}
	
	@Test
public void test3() {
		driver.navigate().to("https://www.automationtalks.com");
	System.out.println(driver.getTitle());
	driver.close();
}

}
