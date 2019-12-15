package org.sel;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit 
{

public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Ramya\\Practise\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
	}
	
	@AfterClass
	public static void afterclass() 
	{
		System.out.println("End of Program");
	}
	
	@Before
	public void before() 
	{
		System.out.println("Before method");
	}
	
	@After
	public void after() 
	{
		System.out.println("After method");
	}
	
	@Test
	public void test1() 
	{
		String url = driver.getCurrentUrl();
		boolean chk = url.contains("adactin");
		Assert.assertTrue("verify url", chk);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ramya123@gmail.com");
		
		String ac = username.getAttribute("value");
		Assert.assertEquals("verify Username", "ramya123@gmail.com",ac);
	}
	
	@Test
	public void test2() 
	{
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("123456");
		
		String pass = pwd.getAttribute("value");
		Assert.assertEquals("verify passworde","123456",pass);
	}
	
		
	
}
