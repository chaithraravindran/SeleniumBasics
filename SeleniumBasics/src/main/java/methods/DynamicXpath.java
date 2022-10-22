package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		
		//String state="Ohio";
		WebElement dropdownStates=driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		dropdownStates.click();
		WebElement emptyTextfield=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		//emptyTextfield.sendKeys(state);
		emptyTextfield.sendKeys("Ohio");
		
		driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='Ohio']")).click();
		
		//driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='"+state+"']")).click();
		//System.out.println("//ul[@class='select2-results__options']//li[text()='"+state+"']");
	}

}
