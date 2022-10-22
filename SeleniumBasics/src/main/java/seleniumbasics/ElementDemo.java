package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDemo 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","E:\\Software Testing\\Selenium\\FirefoxDriver\\geckodriver.exe");
	//System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Selenium\\EdgeDriver\\msedgedriver.exe");
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");//Load or launch the website
	driver.manage().window().maximize();//Maximize browser window
	String title=driver.getTitle();//Fetches the title of the current web page
	System.out.println(title);
	String url=driver.getCurrentUrl();//Fetches the current URL of the current webpage
	System.out.println("url=" +url);
	driver.get(url);
}
} 