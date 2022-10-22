package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedObsquralogo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		WebElement obsquraLogo=driver.findElement(By.xpath("//img[@alt='logo']"));
				
		boolean statusobsquraLogo;
		
		statusobsquraLogo=obsquraLogo.isDisplayed();
		System.out.println("The status of obsquraLogo is:" + statusobsquraLogo);
		
		if(statusobsquraLogo==true)
		{
			System.out.println("The logo is present");
		}
		else
		{
			System.out.println("The logo is absent");
		}
		String attributeValue=obsquraLogo.getAttribute("alt");
		System.out.println("The value of the id attribute is:" +attributeValue);

	}

}
