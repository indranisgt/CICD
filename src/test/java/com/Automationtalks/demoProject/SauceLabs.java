package com.Automationtalks.demoProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {
	
	public static final String USERNAME = "indu2704";
	  public static final String ACCESS_KEY = "4eb179a4-c9a8-4173-bb92-78b532f7a8b5";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "51.0");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j=0;
		String[] list= {"Brocolli", "Tomato" , "Mushroom", "Potato"};
		List<WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		
		
		for(int i=0; i<products.size(); i++) {
			String[] name = driver.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText().split("-");
			String Formattedname = name[0].trim();
			List itemsneeded= Arrays.asList(list);
			
			if(itemsneeded.contains(Formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==list.length) {
					break;
				}
				
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	}

}
