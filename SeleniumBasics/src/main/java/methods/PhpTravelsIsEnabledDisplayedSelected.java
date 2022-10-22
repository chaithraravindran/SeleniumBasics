package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelsIsEnabledDisplayedSelected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
		WebElement checkSubmitisenabled=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
		boolean statusSubmitisenabled;
		statusSubmitisenabled=checkSubmitisenabled.isEnabled();
		System.out.println("The status of Submit button is enabled:" +statusSubmitisenabled);
		
		WebElement checkSubmitisdisplayed=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		boolean statusSubmitisdisplayed;
		statusSubmitisdisplayed=checkSubmitisdisplayed.isDisplayed();
		System.out.println("The status of Submit button is displayed:" +statusSubmitisdisplayed);
		
		WebElement isCheckboxselected=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		isCheckboxselected.click();
		boolean statusCheckboxselected;
		statusCheckboxselected=isCheckboxselected.isSelected();
		System.out.println("The status of Checkbox:" +statusCheckboxselected);
		
	}


}
