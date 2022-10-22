package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeandTextMethod 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		WebElement textMail=driver.findElement(By.xpath("//span[text()='Mail']"));
		String actualText=textMail.getText();
		System.out.println("The actual text is:" +actualText);
		
		String attributeValue=textMail.getAttribute("class");
		System.out.println("The value of the class attribute is:" +attributeValue);
		
		WebElement textGoogle=driver.findElement(By.xpath("//a[@class='google']"));
		String actualText1=textGoogle.getText();
		System.out.println("The actual text is:" +actualText1);
		
		String attributeValue1=textGoogle.getAttribute("target");
		System.out.println("The value of the target attribute is:" +attributeValue1);
		
		WebElement textYoutube=driver.findElement(By.xpath("//a[contains(@class,'you-tube')]"));
		String actualText2=textYoutube.getText();
		System.out.println("The actual text is:" +actualText2);
		
		String attributeValue2=textYoutube.getAttribute("title");
		System.out.println("The value of the title attribute is:" +attributeValue2);
		
		WebElement attributeGithub=driver.findElement(By.xpath("//a[contains(@title,'Github')]"));
		String classAttributevalue=attributeGithub.getAttribute("class");
		System.out.println("The value of the class attribute is:" +classAttributevalue);
		
		WebElement attributeFacebook=driver.findElement(By.xpath("//a[starts-with(@title,'Facebook')]"));
		String hrefAttributevalue=attributeFacebook.getAttribute("href");
		System.out.println("The value of the href attribute is:" +hrefAttributevalue);
		
		WebElement attributeRss=driver.findElement(By.xpath("//a[@title='Rss']"));
		String titleAttributevalue=attributeRss.getAttribute("title");
		System.out.println("The value of the title attribute is:" +titleAttributevalue);
	}

}
