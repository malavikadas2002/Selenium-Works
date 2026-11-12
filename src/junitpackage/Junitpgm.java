package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleverification()
	{
		System.out.println("Test Method 1");
		String actualtitle= driver.getTitle();
		String expectedtitle ="Google";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("The title is matching");
		}
		else
		{
			System.out.println("Title is not matching");
		}
	}
	
	@Test
	public void method2()
	{
	System.out.println("Method 2");	
	}
	
	@AfterEach
	public void closingmethod()
	{
		//driver.close(); 	//to close the browser tab
		driver.quit();
	}
}
