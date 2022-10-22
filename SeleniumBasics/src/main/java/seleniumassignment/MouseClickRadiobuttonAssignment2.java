package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickRadiobuttonAssignment2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action=new Actions(driver);
		
		WebElement maleRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		action.moveToElement(maleRadiobutton).build().perform();
		action.click(maleRadiobutton).build().perform();
		
		WebElement ageGroup19to44=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		action.moveToElement(ageGroup19to44).build().perform();
		action.click(ageGroup19to44).build().perform();
		

	}

}
