package seleniumPackage;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVerification {
	
ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void regpage() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title =\"Rediffmail\"]"));
		boolean result =logo.isDisplayed();		//to verify whether the logo is displayed
		if(result==true)
		{
			System.out.println("The Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		
		WebElement female = driver.findElement(By.xpath("//input[@value=\"f\"]"));
		boolean btnenb= female.isEnabled();		// to verify whether the radio button is enabled or not
		System.out.println("Female button is enabled "+btnenb);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@class=\"nomargin\"]"));
		boolean chkbxbtn = checkbox.isSelected();
		if (chkbxbtn==true)
		{
			System.out.println("Check box is enabled");
		}
		else
		{
			System.out.println("Check box is not selected");
			Thread.sleep(2000);
			checkbox.click();
			
		}	
	}
	
	@AfterEach
    public void closingmthd()
    {
		driver.quit();
    }

}
