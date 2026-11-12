package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpgm {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();	
		//EdgeDriver driver=new EdgeDriver(); 	for opening the MS Edge 
		//FireFoxDriver driver=new FireFoxDriver();		for opening the Firefox
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();	//to retrieve the title of the web application
		System.out.println("The title of web application is "+actualtitle);
		
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title is matching");
		}
		else
		{
			System.out.println("Title is not matching");
		}
		
	}

}
