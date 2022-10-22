package keyboardinteraction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInteractionAmazon {

	public static void main(String[] args) throws AWTException {
		Robot obj=new Robot();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchButton.sendKeys("mobile"+Keys.ENTER);
		//searchButton.sendKeys("mobile"+Keys.CANCEL);
		searchButton.sendKeys("mobile");
		searchButton.sendKeys(Keys.chord(Keys.CONTROL,"a")+Keys.BACK_SPACE);
		obj.keyPress(KeyEvent.VK_DOWN);
	}

}
