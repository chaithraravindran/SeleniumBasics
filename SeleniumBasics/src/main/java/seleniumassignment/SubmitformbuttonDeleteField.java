package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitformbuttonDeleteField {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
				
		WebElement enterFirstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		enterFirstname.sendKeys("Chaithra");
		WebElement enterLastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		enterLastname.sendKeys("Ravindran");
		WebElement enterUsername=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		enterUsername.sendKeys("chaithraravindran");
		WebElement enterCity=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		enterCity.sendKeys("Trivandrum");
		WebElement enterState=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		enterState.sendKeys("Kerala");
		WebElement enterZip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		enterZip.sendKeys("695035");
		WebElement tickAgreetoterms=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		tickAgreetoterms.click();
		WebElement submitformButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitformButton.click();
		enterLastname.clear();

	}

}
