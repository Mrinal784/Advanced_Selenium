package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadElement {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement uploadElement =driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(2000);
		uploadElement.sendKeys("D:\\New Text Document.txt");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();

	}}
