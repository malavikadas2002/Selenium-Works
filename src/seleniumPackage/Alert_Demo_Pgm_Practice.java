package seleniumPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo_Pgm_Practice {
	
ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void alertpge() throws Exception
	{
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		btn.click();
		
		Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();	// to retrieve the alert box text
		System.out.println("alert text = "+text);
		
		Thread.sleep(2000);
		alrt.accept(); 	
		
		Thread.sleep(4000);
		
		WebElement alertokcancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertokcancel.click();
		
		Thread.sleep(4000);
		
		WebElement alrtbtn = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alrtbtn.click();
		
		Alert alrt1 = driver.switchTo().alert();
		String text1 = alrt1.getText();
		System.out.println("alert text = "+text1);
		
		Thread.sleep(2000);
		alrt.dismiss();
		
		WebElement alerttext = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alerttext.click();
		
		WebElement alrttxt = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alrttxt.click();
		
		Alert alrt2 = driver.switchTo().alert();
		String text2 = alrt2.getText();
		System.out.println("alert text = "+text2);
		alrt2.sendKeys("Malavika");
		Thread.sleep(2000);
		alrt2.accept();	
	}
		

}
