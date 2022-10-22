package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();	
		
		WebElement getnewuserButton=driver.findElement(By.xpath("//li[@class='nav-item']/button"));
		boolean statusgetnewuserButton;
		statusgetnewuserButton=getnewuserButton.isDisplayed();
		System.out.println("The button is:"+statusgetnewuserButton);
		if(statusgetnewuserButton==true)
		{
			System.out.println("The button is present");
		}
		else
		{
			System.out.println("The button is absent");
		}
		getnewuserButton.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']/img")));
		WebElement imageDisplayed=driver.findElement(By.xpath("//div[@class='card text-center']/img"));
		boolean statusimageDisplayed;
		statusimageDisplayed=imageDisplayed.isDisplayed();
		System.out.println("The image is:" +statusimageDisplayed);
		if(statusimageDisplayed==true)
		{
			System.out.println("The image is present");
		}
		else
		{
			System.out.println("The image is absent");
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']/h5")));
		WebElement personNamedisplay=driver.findElement(By.xpath("//div[@class='card-body']/h5"));
		String personName=personNamedisplay.getText();
		System.out.println("The name of the person is:" +personName);
	}

}
