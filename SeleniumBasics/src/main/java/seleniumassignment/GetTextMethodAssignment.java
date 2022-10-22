package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enterMessagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessagefield.sendKeys("Hello");
		WebElement clickShowmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		clickShowmessagebutton.click();
		String expectedMessage="Your Message : Hello";
		
		WebElement printedTextmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=printedTextmessage.getText();
		System.out.println("The actual message is:" +actualMessage);
		if(expectedMessage.equals(actualMessage))
		{
			System.out.println("The text is Hello");
		}
		else
		{
			System.out.println("The text is not Hello");
		}
	}

}
