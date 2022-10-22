package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheckboxRadioButton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement clickCheckbox1=driver.findElement(By.xpath(" (//input[@type='checkbox'])[1]"));
		WebElement clickCheckbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		boolean statusCheckbox1;
		boolean statusCheckbox2;
		statusCheckbox1=clickCheckbox1.isSelected();
		System.out.println("The status of Checkbox1 is:" + statusCheckbox1);
		statusCheckbox2=clickCheckbox2.isSelected();
		System.out.println("The status of Checkbox2 is:" + statusCheckbox2);
		if(statusCheckbox1==false)
		{
			clickCheckbox1.click();
		}
		if(statusCheckbox2==false)
		{
			clickCheckbox2.click();
		}
	}

}
