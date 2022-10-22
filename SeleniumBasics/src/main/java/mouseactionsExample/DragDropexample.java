package mouseactionsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropexample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action= new Actions(driver);
		
		WebElement dragdropSource5000Button=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

        WebElement amountSource=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        //action.dragAndDrop(dragdropSource5000Button, amountSource).build().perform();
        
        driver.get("http://selenium.obsqurazone.com/range-sliders.php");
		
        WebElement defaultvalue10=driver.findElement(By.xpath("(//input[@type='range'])[1]"));
        action.moveToElement(defaultvalue10, 10, 0).click().build().perform();
	}

}
