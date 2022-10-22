package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement forgotLink=driver.findElement(By.partialLinkText("Forgotten passwor"));
		//forgotLink.click();
		
		//WebElement forgotLink=driver.findElement(By.tagName("a"));
		
		
		WebElement forgotLink=driver.findElement(By.tagName("input"));//findElement by input tagName
		forgotLink.click();
		
		//WebElement forgotLink=driver.findElement(By.linkText("Forgotten password?"));
		//forgotLink.click();
	}

}