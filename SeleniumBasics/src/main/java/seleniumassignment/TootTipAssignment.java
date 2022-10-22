package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TootTipAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		
		WebElement buttonLikeusonfacebook=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String actualtitleAttributevalue=buttonLikeusonfacebook.getAttribute("title");
		System.out.println("The value of the title attribute or tooltip of Like us on Facebook button is:" +actualtitleAttributevalue);
		String expectedtitleAttributevalue="Follow @obsqurazone on Facebook";
		if(expectedtitleAttributevalue.equals(actualtitleAttributevalue))
		{
			System.out.println("The tooltip of Like us on Facebook button is matching");
		}
		else
		{
			System.out.println("The tooltip of Like us on Facebook button is not matching");
		}
		
		WebElement buttonFollowall=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String actualtitleAttributevalue1=buttonFollowall.getAttribute("title");
		System.out.println("The value of the title attribute or tooltip of Follow all button is:" +actualtitleAttributevalue1);
		String expectedtitleAttributevalue1="Follow @obsqurazone";
		if(expectedtitleAttributevalue1.equals(actualtitleAttributevalue1))
		{
			System.out.println("The tooltip of Follow All button is matching");
		}
		else
		{
			System.out.println("The tooltip of Follow All button is not matching");
		}
	}

}
