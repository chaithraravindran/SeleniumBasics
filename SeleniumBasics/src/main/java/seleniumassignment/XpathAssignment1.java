package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement enterEmail=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		enterEmail.sendKeys("ravindranchaithra@gmail.com");
		WebElement enterPassword=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		enterPassword.sendKeys("Annu123$");
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		loginButton.click();
		driver.navigate().refresh();
		WebElement newtoflipkartcreateanaccountLink=driver.findElement(By.xpath("//a[@class='_14Me7y']"));
		newtoflipkartcreateanaccountLink.click();
	}

}
