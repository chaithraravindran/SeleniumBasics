package mouseactionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAmazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action= new Actions(driver);
		
		WebElement helloSignin=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		action.moveToElement(helloSignin).build().perform();
		action.click(helloSignin).build().perform();
		driver.navigate().back();
		
		WebElement searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		action.clickAndHold(searchField).build().perform();
		Thread.sleep(2000);
		action.release().build().perform();

	}

}
