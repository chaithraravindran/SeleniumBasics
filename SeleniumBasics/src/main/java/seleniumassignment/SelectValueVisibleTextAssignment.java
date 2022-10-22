package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueVisibleTextAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement selectcolorDropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobj=new Select(selectcolorDropdown);
		selectobj.selectByValue("Green");
		
		WebElement twoinputfieldsselectColorfield=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectobj1=new Select(twoinputfieldsselectColorfield);
		selectobj1.selectByVisibleText("Yellow");
		
		WebElement getfirstselectedButton=driver.findElement(By.xpath("//button[@id='button-first']"));
		getfirstselectedButton.click();

	}

}
