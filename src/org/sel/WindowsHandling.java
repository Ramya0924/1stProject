package org.sel;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Ramya\\Practise\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	WebElement txt = driver.findElement(By.id("inputValEnter"));
	txt.sendKeys("iphone 6");
	
	WebElement search = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
	search.click();
	
	WebElement slct = driver.findElement(By.xpath("//p[text()='Apple iPhone 6 Bumper Cases Bright Traders - Blue']"));
	slct.click();
	
	String par = driver.getWindowHandle();
	Set<String> ch1 = driver.getWindowHandles();
	
	System.out.println(par);
	System.out.println(ch1);
	
	for (String s : ch1) 
	{
		if(!par.equals(s))
		{
			driver.switchTo().window(s);
		}
	}
	WebElement add = driver.findElement(By.xpath("//span[text()='add to cart']"));
	add.click();
	
	
	Set<String> ch2 = driver.getWindowHandles();
	System.out.println(ch2);
	
	for (String s1 : ch2) 
	{
		if(!par.equals(s1))
		{
			driver.switchTo().window(s1);
		}
	}
	WebElement tp = driver.findElement(By.xpath("((//div[@class='col-xs-6 individualTupple'])[2]"));
	tp.click();
	
	WebElement tptxt = driver.findElement(By.xpath("//div[text()='WHAT DOES TRUSTPAY STAND FOR?']"));
	String t = tptxt.getText();
	System.out.println(t);
	
	
	
}
}
