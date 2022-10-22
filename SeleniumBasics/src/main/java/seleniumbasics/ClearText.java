package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchField=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchField.sendKeys("mobile");
		String s=searchField.getAttribute("value");
		System.out.println("The value before clear:" +s);
		searchField.clear();
		String n=searchField.getAttribute("value");
		System.out.println("The value after clear:" +n);
	}

}
