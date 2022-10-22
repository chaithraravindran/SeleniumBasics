package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxObsquraAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement clickSinglecheckbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		clickSinglecheckbox.click();
		WebElement clickMultiplecheckbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		clickMultiplecheckbox1.click();
		WebElement clickMultiplecheckbox2=driver.findElement(By.xpath("//input[contains(@id,'check-box-two')]"));
		clickMultiplecheckbox2.click();
		WebElement clickMultiplecheckbox3=driver.findElement(By.xpath("//input[starts-with(@id,'check-box-three')]"));
		clickMultiplecheckbox3.click();
		WebElement clickMultiplecheckbox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		clickMultiplecheckbox4.click();

	}

}
