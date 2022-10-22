package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");//load/navigate a new web page in the existing browser window
		driver.manage().window().maximize();///Maximize browser window
		driver.navigate().to("https://www.facebook.com/");//load/navigate to another new web page
		driver.navigate().back();//takes you back by one page on the browser's history 
		driver.navigate().forward();// takes forward by one page on the browser's history
		driver.navigate().refresh();//refresh/reloads the current web page in the existing browser window
	}
}
