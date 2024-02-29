package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_FormFill {
	
	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\chrome\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Mrinal");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("09714538381");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("mrinal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=address1]")).sendKeys("Nishan square Gujarat");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=city]")).sendKeys("Ahmedabad");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=state]")).sendKeys("Gujarat");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"postalCode\"]")).sendKeys("Gujarat");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name=\"country\"]")).sendKeys("INDIA");
		Thread.sleep(2000);
		
		
	}

}
