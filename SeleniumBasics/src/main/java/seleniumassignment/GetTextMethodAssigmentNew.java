package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodAssigmentNew {

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
		WebElement printedTextmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=printedTextmessage.getText();
		System.out.println("The result message is:" +actualMessage);
		
	}

}
