package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-body']/button")));
		WebElement startdownloadButton=driver.findElement(By.xpath("//div[@class='card-body']/button"));
		startdownloadButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Complete!')]")));
		WebElement completeText=driver.findElement(By.xpath("//div[contains(text(),'Complete!')]"));
		String printText=completeText.getText();
		System.out.println("The text is:" +printText);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui-dialog-buttonset']/button")));
		WebElement closeButton=driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button"));
		closeButton.click();
	}
}
