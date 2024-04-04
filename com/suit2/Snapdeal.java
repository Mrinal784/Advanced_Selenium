package com.suit2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Snapdeal{

	WebDriver driver ;
	String username = "9714538381"; // Change to your username and passwrod
	String password = "9714538381";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://careercenter.tops-int.com/");
		Thread.sleep(2000);
		
	}

	// To log in flipkart
	@Test(priority =0)
	public void login() throws InterruptedException {
	
		driver.findElement(By.id("mobile")).sendKeys("9714538381");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("9714538381");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(2000);
	}

	// Search For product
	@Test(priority =1)
	public void searchAndSelectProduct() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[1]/a")).click();
		Thread.sleep(3000);

		// select the first item in the search results
		
	}

	@Test(priority =2)
	public void buyAndRemoveFromCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
	}

	@Test(priority =3)
	public void logout() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		}

	@AfterClass
	public void quit() {
		driver.close();
	}
}
