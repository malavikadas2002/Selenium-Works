package seleniumPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
	
ChromeDriver driver;
Select obj;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropdownselection()
	{
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		obj = new Select(day);	//creating object for select class
		obj.selectByIndex(23);	//select an option using index position
		
		WebElement month =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		obj = new Select(month);
		obj.selectByValue("02"); // giving the value 2, it is the option tag's index position
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		obj = new Select(year);
		obj.selectByVisibleText("2002");
		
	}

}
