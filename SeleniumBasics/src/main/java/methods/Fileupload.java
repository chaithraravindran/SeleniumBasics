package methods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement chooseFilebutton=driver.findElement(By.xpath("//input[@id='file-upload']"));
		//chooseFilebutton.sendKeys("E:\\Software Testing\\Selenium\\Seleniumfileupload.doc");
		File Seleniumfileupload=new File("E:\\Software Testing\\Selenium\\Seleniumfileupload.doc");
		chooseFilebutton.sendKeys(Seleniumfileupload.getAbsolutePath());
	}

}
