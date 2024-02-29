package com.webdriver;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select select= new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(2000);
		select.selectByVisibleText("Banana");
		Thread.sleep(2000);
		select.selectByValue("orange");
		Thread.sleep(2000);
		select.deselectByVisibleText("Banana");
		Thread.sleep(2000);
		select.deselectByValue("orange");
		Thread.sleep(2000);
		select.deselectAll();
		driver.close();
		
	
	
	}

}
