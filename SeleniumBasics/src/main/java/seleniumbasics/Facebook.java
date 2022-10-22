package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement enterEmail=driver.findElement(By.cssSelector("#email"));
		enterEmail.sendKeys("ravindranchaithra@gmail.com");
		WebElement enterPassword=driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi"));
		enterPassword.sendKeys("Annu1234$");
		WebElement clickLogin=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		clickLogin.click();
		//driver.navigate().refresh();
		//WebElement clickforgottenText=driver.findElement(By.xpath("//a[contains(@class,'_97w4')]"));
		//clickforgottenText.click();
		WebElement clickforgottenText=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		clickforgottenText.click();
		
	}

}
