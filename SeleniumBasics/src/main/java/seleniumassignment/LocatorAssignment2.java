package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement searchfield=driver.findElement(By.id("single-input-field"));
		searchfield.sendKeys("Hello World");
		searchfield.click();
		WebElement searchbutton=driver.findElement(By.id("button-one"));
		searchbutton.click();
		String attributeValue=searchbutton.getAttribute("id");
		System.out.println("The value of the id attribute is:" +attributeValue);

	}

}
