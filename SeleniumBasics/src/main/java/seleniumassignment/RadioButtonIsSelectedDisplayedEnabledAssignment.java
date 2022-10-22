package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonIsSelectedDisplayedEnabledAssignment 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement obsquraLogo=driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
		
		boolean statusobsquraLogo;
		statusobsquraLogo=obsquraLogo.isDisplayed();
		System.out.println("The status of the obsqura logo is:" +statusobsquraLogo);
		if(statusobsquraLogo==true)
		{
			System.out.println("The Obsqura logo is displayed");
			
		}
		else
		{
			System.out.println("The Obsqura logo is not displayed");
		}
		WebElement radioButtonsdemo=driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
		radioButtonsdemo.click();
		WebElement maleradioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		boolean statusmaleradioButton;
		statusmaleradioButton=maleradioButton.isEnabled();
		System.out.println("The status of the male radio button is:"+statusmaleradioButton);
		if(statusmaleradioButton==true)
		{
			maleradioButton.click();
		}
		statusmaleradioButton=maleradioButton.isSelected();
		System.out.println("The status of the male radio button after the click:"+statusmaleradioButton);
		if(statusmaleradioButton==true)
		{
			System.out.println("The male radio button is selected");
		}
		else
		{
			System.out.println("The male radio button is not selected");
		}
		

	}

}
