package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedFast {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fast.com/");
		driver.manage().window().maximize();
		
		WebElement fastLogodisplay=driver.findElement(By.xpath("//div[@class='logo centered']"));
		boolean actualLogo;
		
		actualLogo=fastLogodisplay.isDisplayed();
		System.out.println("The status of the logo is:" +actualLogo);
		
		if(actualLogo==true)
		{
			System.out.println("The logo is present");
		}
		else
		{
			System.out.println("The logo is not present");
		}
		Thread.sleep(3000);
		WebElement internetSpeeddisplay=driver.findElement(By.xpath("//div[@id='speed-value']"));
		String internetspeedPrint=internetSpeeddisplay.getText();
		System.out.println("The speed of the internet is:"+internetspeedPrint);
	}

}
