package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousemovetoElementAssignment3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action= new Actions(driver);
		
		WebElement likeusonfacebookButton=driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		action.moveToElement(likeusonfacebookButton).build().perform();
		
		WebElement followallButton=driver.findElement(By.xpath("//a[text()='Follow All']"));
		action.moveToElement(followallButton).build().perform();
		

	}

}
