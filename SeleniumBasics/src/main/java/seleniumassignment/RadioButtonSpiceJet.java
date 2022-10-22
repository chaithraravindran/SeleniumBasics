package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSpiceJet {

public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();
//WebElement roundtripRadiobutton=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-zso239']//following::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73']"));
//roundtripRadiobutton.click();
//WebElement roundtripRadiobutton=driver.findElement(By.xpath("//div[contains(@data-testid,'round-trip-radio-button')]//div[@class='css-1dbjc4n r-zso239']"));
//roundtripRadiobutton.click();
WebElement roundtripRadiobutton=driver.findElement(By.xpath("//div[contains(@data-testid,'round-trip-radio-button')]"));
roundtripRadiobutton.click();
}
}
