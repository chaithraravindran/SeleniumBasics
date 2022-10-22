package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?hl=en-US");
		driver.manage().window().maximize();
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("Laptops");
		searchfield.click();
		WebElement searchbutton=driver.findElement(By.name("btnK"));
		searchbutton.click();
	}

}
