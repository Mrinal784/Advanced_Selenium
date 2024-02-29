package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elemens_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tops-int.com/python-training-course");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.name("name"));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getAttribute("ID"));
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
