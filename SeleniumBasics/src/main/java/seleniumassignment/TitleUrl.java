package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleUrl 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Selenium\\EdgeDriver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	String url=("https://www.flipkart.com/");
	driver.get(url);
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	}

}
