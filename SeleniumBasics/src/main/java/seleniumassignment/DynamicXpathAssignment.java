package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
			
		WebElement dropdownStates=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		dropdownStates.click();
			
					
		dropdownStates.sendKeys("Colorado");
		dropdownStates.sendKeys("Arizona");
		dropdownStates.sendKeys("New Mexico");
		dropdownStates.sendKeys("Florida");
			
		WebElement selectState1=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='Colorado']"));
		selectState1.click();
		dropdownStates.click();
			
		WebElement selectState2=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='Arizona']"));
		selectState2.click();
		dropdownStates.click();
			
		WebElement selectState3=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='New Mexico']"));
		selectState3.click();
		dropdownStates.click();
			
		WebElement selectState4=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='Florida']"));
		selectState4.click();
		dropdownStates.click();
	}
}
