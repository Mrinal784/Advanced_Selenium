package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ATuJsjyvHOnSr9Ry6nhqnGU8Pk9YLgFkI-K4Dp_lOkYFunvdyRpttQPoyoGILtbu11KuFAy6fyH6aw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S621345335%3A1708553029960424&theme=glif");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement email=driver.findElement(By.name("identifier"));
		Action series_of_action=action
				.moveToElement(email)
				.click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys("mrinal")
				.keyUp(email,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		series_of_action.perform();
		Thread.sleep(10000);
		driver.close();
				
		
		
		
		
		
		
	}

}
