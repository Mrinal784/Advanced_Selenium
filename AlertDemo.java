package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("5264");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		
		
		
}}
