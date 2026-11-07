package com.addtocart;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();//Browser 
		ChromeDriver driver= new ChromeDriver(); //Browser type
		
		driver.get("https://tutorialsninja.com/demo/");//website
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();//click on account
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rupeshranjan49@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Rupesh@49");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("I phone");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		
		
	}

}
