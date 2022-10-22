package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesAmazon {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//WebElement searchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//String backgroundColor=searchButton.getCssValue("color");
		//System.out.println("The color of the search button is:" +backgroundColor);

System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://selenium.obsqurazone.com/simple-form-demo.php");
driver.manage().window().maximize();

WebElement showmessagebuttonColor=driver.findElement(By.xpath("//button[@id='button-one']"));
String backgroundColor=showmessagebuttonColor.getCssValue("background-color");
String color=showmessagebuttonColor.getCssValue("color");
System.out.println("The background color of the search button is:" +backgroundColor);
System.out.println("The color of the search button is:" +color);
}

}