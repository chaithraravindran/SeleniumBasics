package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedSelectedEnabled {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement clickonthisCheckbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		clickonthisCheckbox.click();
		WebElement clickCheckbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement clickCheckbox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement clickCheckbox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement clickCheckbox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		clickCheckbox4.click();
		
		boolean statusclickonthisCheckbox;
		boolean statusclickCheckbox1;
		boolean statusclickCheckbox2;
		boolean statusclickCheckbox3;
		boolean statusclickCheckbox4;
		
		statusclickonthisCheckbox=clickonthisCheckbox.isSelected();
		System.out.println("The status of click on this checkbox is:" +statusclickonthisCheckbox);
		statusclickCheckbox1=clickCheckbox1.isSelected();
		System.out.println("The status of Checkbox1 is:" +statusclickCheckbox1);
		statusclickCheckbox2=clickCheckbox2.isSelected();
		System.out.println("The status of Checkbox2 is:" +statusclickCheckbox2);
		statusclickCheckbox3=clickCheckbox3.isSelected();
		System.out.println("The status of Checkbox3 is:" +statusclickCheckbox3);
		statusclickCheckbox4=clickCheckbox4.isSelected();
		System.out.println("The status of Checkbox4 is:" +statusclickCheckbox4);
		
		WebElement obsquraLogo=driver.findElement(By.xpath("//img[@alt='logo']"));
		
		boolean statusobsquraLogo;
		statusobsquraLogo=obsquraLogo.isDisplayed();
		System.out.println("The status of Obsqura Logo is:" +statusobsquraLogo);
		
		if(statusobsquraLogo==true)
		{
			System.out.println("The logo is present");
		}
		else 
		{
			System.out.println("The logo is absent");
		}
		WebElement homeButton=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		
		boolean statushomeButton;
		statushomeButton=homeButton.isDisplayed();
		System.out.println("The status of the Home button is:" +statushomeButton);
		if(statushomeButton==true) 
		{
			System.out.println("The Home button is present");
		}
		else
		{
			System.out.println("The Home button is absent");
		}
		WebElement selectallButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		
		boolean statusselectallButton;
		
		statusselectallButton=selectallButton.isEnabled();
		System.out.println("The status of the Select All button is:" +statusselectallButton);
		if(statusselectallButton==true)
		{
			System.out.println("The Select All button is enabled");
			
		}
		else 
		{
			System.out.println("The Select All button is not enabled");
		}
		
		
	}

}
