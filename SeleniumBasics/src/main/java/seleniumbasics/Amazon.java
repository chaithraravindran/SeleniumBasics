package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField=driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("Mobile");
		String expectedTooltip="Search in";
		WebElement allDropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String actualTooltip=allDropdown.getAttribute("title");
		System.out.println("The value of the title attribute is :" +actualTooltip);
		
		WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		//driver.findElement(By.xpath("//img[@class='s-image']")).click();
		//driver.quit();
		//driver.close();
		
	
		//WebElement clickOneplus=driver.findElement(By.id("p_89/OnePlus"));
		//clickOneplus.click();
		//WebElement hellosigninAccounts=driver.findElement(By.xpath("//span[starts-with(text(),'Hello, sign in')]"));
		//hellosigninAccounts.click();
	}

}
