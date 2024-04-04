package com.suit1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart{

	WebDriver driver ;
	String username = "standard_user"; // Change to your username and passwrod
	String password = "secret_sauce";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Desktop\\Automation tool\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
	}

	// To log in flipkart
	@Test(priority =0)
	public void login() throws InterruptedException {
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	// Search For product
	@Test(priority =1)
	public void searchAndSelectProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(2000);

		// select the first item in the search results
		
	}

	@Test(priority =2)
	public void buyAndRemoveFromCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}

	@Test(priority =3)
	public void logout() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		}

	@AfterClass
	public void quit() {
		driver.close();
	}
}