package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextExamplegetTextMethod 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		WebElement radioButtonyes=driver.findElement(By.xpath("//input[@id='yes']"));
		radioButtonyes.click();
		WebElement checkButton=driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		checkButton.click();
		String expectedMessage="Radio button is checked and it's value is Yes";
		
		
		WebElement responseMessage=driver.findElement(By.xpath("//p[@class='radiobutton']"));
		String actualMessage=responseMessage.getText();
		System.out.println(actualMessage);
		if(expectedMessage.equals(actualMessage))
		{
			System.out.println("Radio button yes is working");
		}
		else
		{
			System.out.println("Radio button yes is not working");
		}
		driver.quit();
	}	
		

}
