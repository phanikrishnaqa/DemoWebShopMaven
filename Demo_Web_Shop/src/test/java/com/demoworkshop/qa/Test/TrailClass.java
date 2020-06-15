package com.demoworkshop.qa.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrailClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[6]/a")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Your Own Jewelry')]")).click();
		
		List <WebElement> Select_Pendent_Shape = driver.findElements(By.xpath("//input [@ name ='product_attribute_71_11_17']"));
		
		for(int i=0; i<Select_Pendent_Shape.size();i++)
		{
			WebElement RadioButton = Select_Pendent_Shape.get(i);
			String PendentShape = RadioButton.getAttribute("Value");
			System.out.println("Type of Meterial : "+ PendentShape);
			if (PendentShape.equalsIgnoreCase("50"))
			{
				RadioButton.click();
			}
		}
		
		
	}

}
