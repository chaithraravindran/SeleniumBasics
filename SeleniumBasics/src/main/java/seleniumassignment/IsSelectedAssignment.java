package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement clickonthisCheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		boolean statusClickonthischeckbox;
		boolean statusCheckbox1;
		boolean statusCheckbox2;
		boolean statusCheckbox3;
		boolean statusCheckbox4;
		
		statusClickonthischeckbox=clickonthisCheckbox.isSelected();
		System.out.println("The status of click on this checkbox is :" +statusClickonthischeckbox);
		statusCheckbox1=checkBox1.isSelected();
		System.out.println("The status of checkbox1 is:" +statusCheckbox1);
		statusCheckbox2=checkBox2.isSelected();
		System.out.println("The status of checkbox2 is:" +statusCheckbox2);
		statusCheckbox3=checkBox3.isSelected();
		System.out.println("The status of checkbox3 is:" +statusCheckbox3);
		statusCheckbox4=checkBox4.isSelected();
		System.out.println("The status of checkbox4 is:" +statusCheckbox4);
		
		WebElement selectallButton=driver.findElement(By.xpath("//input[@value='Select All']"));
		selectallButton.click();
		
		clickonthisCheckbox.click();
		statusClickonthischeckbox=clickonthisCheckbox.isSelected();
		System.out.println("The current status of click on this checkbox is :" +statusClickonthischeckbox);
		statusCheckbox1=checkBox1.isSelected();
		System.out.println("The current status of checkbox1 is:" +statusCheckbox1);
		statusCheckbox2=checkBox2.isSelected();
		System.out.println("The current status of checkbox2 is:" +statusCheckbox2);
		statusCheckbox3=checkBox3.isSelected();
		System.out.println("The current status of checkbox3 is:" +statusCheckbox3);
		statusCheckbox4=checkBox4.isSelected();
		System.out.println("The current status of checkbox4 is:" +statusCheckbox4);
		
	}

}
