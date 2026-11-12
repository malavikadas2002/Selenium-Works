package seleniumPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/kkabh/OneDrive/Desktop/alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void alertpge() throws Exception
	{
		WebElement dispalertbox = driver.findElement(By.xpath("/html/body/input[1]"));
		dispalertbox.click();
		
		//to handle alert boxes
		Alert alrt = driver.switchTo().alert();	//switch to alert boxes, creating a reference to alert interface
		String text = alrt.getText();	// to retrieve the alert box text
		System.out.println("alert text = "+text);
		
		Thread.sleep(2000);
		alrt.accept(); 	//to click on ok
		//alrt.dismiss()  - to click on cancel or dismiss
		
		WebElement firstname = driver.findElement(By.xpath("/html/body/input[2]"));
		firstname.sendKeys("Malavika");
		
		WebElement lastname = driver.findElement(By.xpath("/html/body/input[3]"));
		lastname.sendKeys("T");
		
		WebElement submit = driver.findElement(By.xpath("/html/body/input[4]"));
		submit.click();
				
	}

}
