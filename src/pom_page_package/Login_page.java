package pom_page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	WebDriver driver;
	
	//locating web elements using page factory
	
	@FindBy (xpath = "//*[@id=\"ulogin\"]") WebElement username;
	@FindBy (id="upass") WebElement password;	//locating a webElement using id
	@FindBy (xpath = "//*[@id=\"sub_logbtn\"]") WebElement loginbtn;
	
	//constructor
	public Login_page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void setvalues()
	{
		username.sendKeys("abc@gmail.com");
		password.sendKeys("1234");
	}
	
	public void loginmthd()
	{
		loginbtn.click();
	}
	
	public String titleverification_mthd()
	{
		String title = driver.getTitle();
		return title;
	}

}
