package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlertAssignment {
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickme1Button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme1Button.click();
		String textinButton1=driver.switchTo().alert().getText();
		System.out.println("The text in click me button 1 is:" +textinButton1);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement clickme2Button=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2Button.click();
		String textinButton2=driver.switchTo().alert().getText();
		System.out.println("The text in click me button 2 is:" +textinButton2);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		clickme2Button.click();
		driver.switchTo().alert().accept();
		
		WebElement clickforCommandpromptButton=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		clickforCommandpromptButton.click();
		String textinButton3=driver.switchTo().alert().getText();
		System.out.println("The text in click for command prompt button is:" +textinButton3);
		driver.switchTo().alert().sendKeys("I am Chaithra");
		driver.switchTo().alert().dismiss();
		clickforCommandpromptButton.click();
		driver.switchTo().alert().sendKeys("I am Chaithra");
		driver.switchTo().alert().accept();
	}
}
