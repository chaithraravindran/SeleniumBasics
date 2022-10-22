package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickCheckboxesAssignment1 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();

		Actions action=new Actions(driver);
		
		WebElement singleCheckbox1=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		action.moveToElement(singleCheckbox1).build().perform();
		action.click(singleCheckbox1).build().perform();
		
		WebElement multipleCheckbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		action.moveToElement(multipleCheckbox1).build().perform();
		action.click(multipleCheckbox1).build().perform();

		WebElement multipleCheckbox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		action.moveToElement(multipleCheckbox2).build().perform();
		action.click(multipleCheckbox2).build().perform();
		
		WebElement multipleCheckbox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		action.moveToElement(multipleCheckbox3).build().perform();
		action.click(multipleCheckbox3).build().perform();
		
		WebElement multipleCheckbox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		action.moveToElement(multipleCheckbox4).build().perform();
		action.click(multipleCheckbox4).build().perform();
     }
}
