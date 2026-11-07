/**
 * 
 */
package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class Addtocarttest {
	
    @Test
    public void addToCart() {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rupeshranjan49@gmail.com");

        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Rupesh@49");

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("iPhone");

        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();


    }
}


