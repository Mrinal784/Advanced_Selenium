package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radia_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get( "https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement r1 = driver.findElement(By.id("vfb-7-1"));
		r1.click();
		Thread.sleep(2000);
		WebElement r2 = driver.findElement(By.id("vfb-7-2"));
		r2.click();
		Thread.sleep(2000);
		WebElement r3 = driver.findElement(By.id("vfb-7-3"));
		r3.click();
		Thread.sleep(2000);

		WebElement c1 = driver.findElement(By.id("vfb-6-0"));
		c1.click();
		Thread.sleep(2000);

		WebElement c2 = driver.findElement(By.id("vfb-6-1"));
		c2.click();
		Thread.sleep(2000);
		
		WebElement c3 = driver.findElement(By.id("vfb-6-2"));
		c3.click();
		Thread.sleep(2000);
		if (c3.isSelected())
		{
			c3.click();
		}
		Thread.sleep(2000);
		driver.close();
	}
}
