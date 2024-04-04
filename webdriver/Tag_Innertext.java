package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Innertext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String txt=driver.findElement(By.cssSelector("font:innerText('Atlanta')")).getText();
		System.out.println(txt);
		
	}

}
