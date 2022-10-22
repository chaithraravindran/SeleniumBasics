package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement radioButton2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		radioButton2.click();
		WebElement checkBox1=driver.findElement(By.xpath("//input[contains(@id,'vfb-6-0')]"));
		checkBox1.click();
		WebElement checkBox2=driver.findElement(By.xpath("//input[starts-with(@id,'vfb-6-1')]"));
		checkBox2.click();
		WebElement checkBox3=driver.findElement(By.xpath("//input[contains(@value,'checkbox3')]"));
		checkBox3.click();
	}

}
