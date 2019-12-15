package org.sel;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Ramya\\Practise\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table");
	
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tRows.size(); i++) 
	{
		WebElement tRow = tRows.get(i);
		List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
		
		for (int j = 0; j < tDatas.size(); j++) 
		{
			WebElement tData = tDatas.get(j);
			String text = tData.getText();
			//System.out.println(text);
			
			
			if(text.equals("Taiwan"))
			{
				System.out.println(text);
				driver.get("https://www.facebook.com/");
				WebElement fbusername = driver.findElement(By.id("email"));
				fbusername.sendKeys(text);
			}
		}	
	}
	}
}

