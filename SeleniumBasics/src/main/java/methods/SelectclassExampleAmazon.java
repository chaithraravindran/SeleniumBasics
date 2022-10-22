package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassExampleAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select selectobj=new Select(dropDown);//Aggregation
		selectobj.selectByIndex(3);
		//selectobj.selectByIndex(6);
		selectobj.selectByValue("search-alias=nowstore");
		//selectobj.selectByValue("search-alias=todays-deals");
		selectobj.selectByVisibleText("Garden & Outdoors");
	}

}
