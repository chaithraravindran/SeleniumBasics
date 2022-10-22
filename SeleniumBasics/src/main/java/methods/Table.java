package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		//WebElement fullTable=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		//String tableContent=fullTable.getText();
		//System.out.println("The contents in the table is" +tableContent);
		WebElement rowcolumnTablevalue=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[7]//td[3]"));
		String tableContent1=rowcolumnTablevalue.getText();
		System.out.println("The contents in the table is" +tableContent1);
		
		WebElement rowcolumnTablevalue1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//th[2]"));
		String tableContent2=rowcolumnTablevalue1.getText();
		System.out.println("The contents in the table is" +tableContent2);
		
		List<WebElement> nameElements=driver.findElements(By.xpath("//tbody//tr[1]//td"));
		/*for(int i=0;i<nameElements.size();i++)
		{
			String name=nameElements.get(i).getText();
			System.out.println("The names are:" +name);
		}*/
		for(WebElement s:nameElements)
		{
			System.out.println(s.getText());
		}
	}

}
