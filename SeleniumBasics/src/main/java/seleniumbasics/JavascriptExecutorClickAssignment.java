package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutorClickAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='  Like us On Facebook ']")));
		WebElement likeusonfacebookButton=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		String textinButton1=likeusonfacebookButton.getText();
		System.out.println("The text in button 1 is:" +textinButton1);
		js.executeScript("arguments[0].click();", likeusonfacebookButton);
		
		WebElement followallButton=driver.findElement(By.xpath("//a[text()='Follow All']"));
		js.executeScript("arguments[0].click();", followallButton);

	}

}
