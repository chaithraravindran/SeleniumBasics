package keyboardinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement clickJsAlert1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		clickJsAlert1.click();
		String messageOne=driver.switchTo().alert().getText();
		System.out.println("The alert message is:" +messageOne);
		driver.switchTo().alert().accept();
		
		WebElement clickJsAlert2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		clickJsAlert2.click();
		String messagetwo=driver.switchTo().alert().getText();
		System.out.println("The alert message is:" +messagetwo);
		driver.switchTo().alert().dismiss();
		clickJsAlert2.click();
		driver.switchTo().alert().accept();
		
		WebElement clickJsAlert3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		clickJsAlert3.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().dismiss();
		clickJsAlert3.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
	}

}
