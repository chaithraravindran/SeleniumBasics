package methodworkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignIn {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement enterEmailaddressfield=driver.findElement(By.xpath("//input[@id='email']"));
		enterEmailaddressfield.sendKeys("sparklingrose000@gmail.com");
		WebElement enterPasswordfield=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		enterPasswordfield.sendKeys("Annu12$$");
		WebElement clickLogin=driver.findElement(By.xpath("//button[@name='login']"));
		String s=clickLogin.getText();
		System.out.println("The text is:" +s);
		clickLogin.click();
		
		
	}

}
