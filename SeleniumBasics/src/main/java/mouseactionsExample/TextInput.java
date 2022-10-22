package mouseactionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextInput {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action= new Actions(driver);
		WebElement enterMessageButton=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		action.sendKeys(enterMessageButton,"Hello").build().perform();
		action.keyDown(enterMessageButton,Keys.CONTROL).build().perform();
		action.sendKeys(enterMessageButton,"a").build().perform();
		action.keyUp(enterMessageButton,Keys.CONTROL).build().perform();
		action.keyDown(enterMessageButton,Keys.BACK_SPACE).build().perform();
		action.keyUp(enterMessageButton, Keys.BACK_SPACE).build().perform();
		enterMessageButton.clear();
		
		enterMessageButton.sendKeys("Hello World");
		action.sendKeys(enterMessageButton,Keys.BACK_SPACE).build().perform();
		

	}

}
