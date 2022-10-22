package seleniumassignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableAssignment {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		WebElement ageHerrod=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[7]//td[4]"));
		String age=ageHerrod.getText();
		System.out.println("The age of Herrod Chandler is:" +age);
		
		List<WebElement> allOffices=driver.findElements(By.xpath("//tbody//tr//td[3]"));
		for(int i=0;i<allOffices.size();i++)
		{
			String places=allOffices.get(i).getText();
			System.out.println("The places are:" +places);
		}
		
		List<WebElement> alldataCedric=driver.findElements(By.xpath("//tbody//tr[4]//td"));
		/*for(int i=0;i<alldataCedric.size();i++)
		{
			String alldataCedrickelly=alldataCedric.get(i).getText();
			System.out.println("The full details of CedricKelly is :" +alldataCedrickelly);
		}*/
		for(WebElement j:alldataCedric)
		{
			System.out.println("The full details of CedricKelly is:" +j.getText());
		}
	}
}
