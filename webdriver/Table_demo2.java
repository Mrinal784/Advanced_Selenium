package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List <WebElement> cols= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
				
		System.out.println("No. Of collumn :" + cols.size());
		Thread.sleep(2000);
		
		List <WebElement> rows= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("No. Of rows :" + rows.size());
		Thread.sleep(2000);
		for(WebElement w:rows)
		{

			System.out.println(w.getText());
			Thread.sleep(2000);
		
		}
		driver.quit();
	}
}
