package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavasciptExecutorScrollAssignment {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://selenium.obsqurazone.com/date-picker.php");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,6000)");

	/*WebElement showdateButton2=driver.findElement(By.xpath("//button[@id='button-two']"));
	js.executeScript("arguments[0].click();",showdateButton2);
	
	js.executeScript("arguments[0].scrollIntoView();", showdateButton2);*/
	
	
}
}
