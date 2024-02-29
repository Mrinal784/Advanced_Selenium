package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement email=driver.findElement(By.name("email"));
		Action series_of_action=action
				.moveToElement(email)
				.click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys("mrinal")
				.keyUp(email,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		series_of_action.perform();
		Thread.sleep(10000);
		driver.close();
				
		
		
		
		
		
		
	}

}
