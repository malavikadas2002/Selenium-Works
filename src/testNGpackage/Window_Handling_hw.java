package testNGpackage;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Window_Handling_hw {
	
ChromeDriver driver;
	
	@BeforeTest
	public void stup()
	{
	driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testmthd() throws Exception
	{
	String parentwindow = driver.getWindowHandle();
	System.out.println("Title of Page= " +driver.getTitle());
	
	WebElement tabclick = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
	tabclick.click();
	driver.navigate().refresh();
	
	ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());	//to store all open browser window handles in a list
	driver.switchTo().window(windowdetails.get(1));	//redirect back to 1st tab (index position)

	System.out.println("Title of opened page = " +driver.getTitle());
	driver.switchTo().window(parentwindow);
	
	WebElement seperatewindow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	seperatewindow.click();
	WebElement seperateclick = driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
	seperateclick.click();
	
	Thread.sleep(3000);
	System.out.println("Title of opened page = " +driver.getTitle());
	
	driver.switchTo().window(parentwindow);
	
	WebElement multiplewindow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	multiplewindow.click();
	WebElement multipleclick = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
	multipleclick.click();
	
	ArrayList<String> windowdetails1 = new ArrayList<>(driver.getWindowHandles());	//to store all open browser window handles in a list
	driver.switchTo().window(windowdetails1.get(2));
	
	Thread.sleep(3000);
	System.out.println("Title of opened page = " +driver.getTitle());
	
	driver.switchTo().window(parentwindow);
	}
	
	@AfterTest
	public void ends()
	{
		driver.quit();
	}

}
