package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Ramya\\Practise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement pge = driver.findElement(By.xpath("//p[text()='Selenium Test Paper']"));
	
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", pge);
		Thread.sleep(2000);
		
		WebElement jkup = driver.findElement(By.xpath("//p[text()=' Interview Questions']"));
		jk.executeScript("arguments[0].scrollIntoView(false)", jkup);
		
	}
}
