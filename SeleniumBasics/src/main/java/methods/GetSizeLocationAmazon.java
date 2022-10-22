package methods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLocationAmazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//org.openqa.selenium.Dimension searchFieldsize=searchField.getSize();
		System.out.println("The size of the search field is:"+searchField.getSize());
		System.out.println("The x location of the search field is:"+searchField.getLocation().getX());
		System.out.println("The y location of the search field is:"+searchField.getLocation().getY());
		System.out.println("The location of the search field is:"+searchField.getLocation());//Prints the location both x & y co-ordinates
		
		//int searchFieldlocation=searchField.getLocation().getX();
		//System.out.println("The x location of the search field is:"+searchFieldlocation);
		//int searchFieldlocation1=searchField.getLocation().getY();
		//System.out.println("The y location of the search field is:"+searchFieldlocation1);
		
		//String html=driver.getPageSource();
		//System.out.println("The full html code:" +html);
	}

}
