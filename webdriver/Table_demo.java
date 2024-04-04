package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String innerText = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(innerText);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
