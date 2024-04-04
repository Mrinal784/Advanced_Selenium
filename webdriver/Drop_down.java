package com.webdriver;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select select= new Select(driver.findElement(By.name("country")));
		Thread.sleep(2000);
		select.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		select.selectByValue("ITALY");
		Thread.sleep(2000);
		driver.close();
		
	
	
	}

}
