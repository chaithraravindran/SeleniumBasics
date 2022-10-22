package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVerificationAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		WebElement verifytextjQueryui=driver.findElement(By.xpath("//div[@class='example my-3']//div[contains(text(),'JQuery UI Progress bar - Download Dialog')]"));
		String actualText=verifytextjQueryui.getText();
		System.out.println("The actual text is:"+actualText);
		String expectedResult="JQuery UI Progress bar - Download Dialog";
		
		if(expectedResult.equals(actualText))
		{
			System.out.println("The text is matching");
		}
		else
		{
			System.out.println("The text is not matching");
		}
		WebElement startdownloadButton=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		String actualText1=startdownloadButton.getText();
		System.out.println("The actual text is:"+actualText1);
		String expectedResult1="Start Download";
		
		if(expectedResult1.equals(actualText1))
		{
			System.out.println("The text is matching");
		}
		else
		{
			System.out.println("The text is not matching");
		}
		
	}

}
