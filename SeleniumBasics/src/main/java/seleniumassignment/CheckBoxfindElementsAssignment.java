package seleniumassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxfindElementsAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement i:checkBoxes)
		{
			i.click();
		}
		
		/*List<WebElement> singlecheckBoxes=driver.findElements(By.xpath("//input[@id='gridCheck']"));
		//singlecheckBoxes.get(0).click();
		for(int i=0;i<singlecheckBoxes.size();i++)
		{
			singlecheckBoxes.get(i).click();
		}
		List<WebElement> multiplecheckBoxes=driver.findElements(By.xpath("//input[@class='check-box-list']"));			
		for(int i=0;i<multiplecheckBoxes.size();i++)
		{
			multiplecheckBoxes.get(i).click();
		}*/
	}
}
