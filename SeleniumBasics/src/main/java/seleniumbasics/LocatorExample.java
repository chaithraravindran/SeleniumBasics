package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//WebElement dropDown=driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"));
		//dropDown.click();
		
		//WebElement searchField=driver.findElement(By.id("twotabsearchtextbox"));
		//searchField.sendKeys("mobile");
		//searchField.click();
		
		//WebElement searchField=driver.findElement(By.className("nav-input nav-progressive-attribute"));
		
		//WebElement csssearchField=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//csssearchField.sendKeys("mobile");
		
		//WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		//searchButton.click();
		
		//driver.get("https://www.flipkart.com/");
		//WebElement closeButton=driver.findElement(By.className("_2KpZ6l _2doB4z"));
		//closeButton.click();
		
		//WebElement forgotLink=driver.findElement(By.tagName("select"));//findElement by select tagName
		//forgotLink.click();
		
		//WebElement searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchField.sendKeys("Books");
		
		
		//WebElement searchField=driver.findElement(By.xpath("//div[@class='nav-search-field ']//input[@class='nav-input nav-progressive-attribute']"));
		//searchField.sendKeys("Laptops");
		
		//WebElement searchButton=driver.findElement(By.xpath("//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@id='nav-search-submit-button']"));
		//searchButton.click();
		
		//WebElement hellosigninAccounts=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		//hellosigninAccounts.click();
		
		WebElement hellosigninAccountsList=driver.findElement(By.xpath("//span[contains(text(),'Select your address')]//following::span[starts-with(text(),'Hello')]"));
		System.out.println(hellosigninAccountsList.getText());
		hellosigninAccountsList.click();
		
		//WebElement helloselectyourAddress=driver.findElement(By.xpath("//span[contains(text(),'Select your address')]"));
		//helloselectyourAddress.click();
				
		//WebElement todaysDeals=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		//todaysDeals.click();
	}
}
