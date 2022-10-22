package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseclickAndHoldDoubleClickAssignment28 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action=new Actions(driver);
		
		WebElement enterMessageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		action.clickAndHold(enterMessageField).build().perform();
		action.sendKeys("Hello").build().perform();
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		action.doubleClick(showMessageButton).build().perform();
	}

}
