package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void drgdrp() throws Exception
	{
		WebElement drg = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drp = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drg, drp).perform();
		
		Thread.sleep(2000);
		
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		act.moveToElement(hover).perform();
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		link1.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement clickndhold = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(clickndhold).perform();
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		act.doubleClick(doubleclick);
		act.perform();
	}

}
