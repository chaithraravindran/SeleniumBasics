package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumObsquraZonebootstrapclickAssignment {

public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://selenium.obsqurazone.com/bootstrap-dual-list.php");
driver.manage().window().maximize();
		
WebElement clickOption1=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 1']"));
clickOption1.click();
WebElement clickOption2=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[@value='option2']"));
clickOption2.click();
WebElement clickOption3=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-selected-list_duallistbox_demo1[]']//option[@value='option3']"));
clickOption3.click();	
WebElement clickOption4=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[@value='option4']"));
clickOption4.click();	
WebElement clickOption5=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 5']"));
clickOption5.click();	
WebElement clickOption6=driver.findElement(By.xpath("(//option[text()='Option 6'])[1]"));
clickOption6.click();	
WebElement clickOption7=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 7']"));
clickOption7.click();
WebElement clickOption8=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[@value='option8']"));
clickOption8.click();
WebElement clickOption9=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[contains(text(),'Option 9')]"));
clickOption9.click();
WebElement clickOption10=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[@value='option0']"));
clickOption10.click();
	}
}
