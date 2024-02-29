package com.webdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mousekeyboard2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&ifkv=ATuJsjyV0qYErcSC61TfnzVxJXkyaHkJw6QaCVB2AwJC1Wozo2fePrtE6A-3AYdDcCbWnGDnQpUW_A&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1257264715%3A1708633800963199&theme=glif");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement email=driver.findElement(By.name("identifier"));
		Action steps_action = action
				.moveToElement(email)
				.click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys("Mrinal@gmail.com")
				.keyUp(email,Keys.SHIFT)
				.doubleClick()
				.build();
		steps_action.perform();
				driver.close();
		
		
		
		
		
		
	}

}
