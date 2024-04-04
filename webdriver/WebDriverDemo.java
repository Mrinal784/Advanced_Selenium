package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("Webdriver.chrome.driver","D:\\Documents\\Music\\chrome driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("Mrinal");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("Mrinal");
	driver.close();
	
}

}
