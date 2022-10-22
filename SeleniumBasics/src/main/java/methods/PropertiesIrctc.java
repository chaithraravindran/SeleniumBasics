package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesIrctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();

		WebElement okbuttonColor=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String actualbackgroundColor=okbuttonColor.getCssValue("background-color");
		String actualColor=okbuttonColor.getCssValue("color");
		System.out.println("The background color of the search button is:" +actualbackgroundColor);
		System.out.println("The color of the search button is:" +actualColor);
	
		String expectedbackgroundColor="rgba(251, 121, 43, 1)";
		if(expectedbackgroundColor.equals(actualbackgroundColor))
		{
			System.out.println("The color is matching");
		}
		else
		{
			System.out.println("The color is not matching");
		}
		String actualfontsize=okbuttonColor.getCssValue("font-size");
		System.out.println("The actual font size of the search button is:" +actualfontsize);
		String actualfontstyle=okbuttonColor.getCssValue("font-style");
		System.out.println("The actual font style of the search button is:" +actualfontstyle);
		String actualfontweight=okbuttonColor.getCssValue("font-weight");
		System.out.println("The actual font weight of the search button is:" +actualfontweight);
		String actualfontfamily=okbuttonColor.getCssValue("font-family");
		System.out.println("The actual font family of the search button is:" +actualfontfamily);
		
	}

}
