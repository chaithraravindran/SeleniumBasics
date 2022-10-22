package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssvaluePropertiesAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		
		WebElement autocloseablesuccessButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		String backgroundcolorautocloseablesucessButton=autocloseablesuccessButton.getCssValue("background-color");
		System.out.println("The background color of the Autocloseable success button is:" +backgroundcolorautocloseablesucessButton);
		String fontcolorautocloseablesuccessButton=autocloseablesuccessButton.getCssValue("color");
		System.out.println("The font color of the Autocloseable success button is:" +fontcolorautocloseablesuccessButton);
		String fontsizeautocloseablesuccessButton=autocloseablesuccessButton.getCssValue("font-size");
		System.out.println("The font size of the Autocloseable success button is:" +fontsizeautocloseablesuccessButton);
		String fontweightautocloseablesuccessButton=autocloseablesuccessButton.getCssValue("font-weight");
		System.out.println("The font weight of the Autocloseable success button is:" +fontweightautocloseablesuccessButton);
		
		WebElement normalsuccessButton=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		String backgroundcolornormalsuccessButton=normalsuccessButton.getCssValue("background-color");
		System.out.println("The background color of the Normal success button is:" +backgroundcolornormalsuccessButton);
		String fontcolornormalsuccessButton=normalsuccessButton.getCssValue("color");
		System.out.println("The font color of the Normal success button is:" +fontcolornormalsuccessButton);
		String fontsizenormalsuccessButton=normalsuccessButton.getCssValue("font-size");
		System.out.println("The font size of the Normal success button is:" +fontsizenormalsuccessButton);
		String fontweightnormalsuccessButton=normalsuccessButton.getCssValue("font-weight");
		System.out.println("The font weight of the Normal success button is:" +fontweightnormalsuccessButton);
		
		WebElement autocloseablewarningButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		String backgroundcolorautocloseablewarningButton=autocloseablewarningButton.getCssValue("background-color");
		System.out.println("The background color of the Autocloseable warning button is:"+backgroundcolorautocloseablewarningButton);
		String fontcolorautocloseablewarningButton=autocloseablewarningButton.getCssValue("color");
		System.out.println("The color of the Autocloseable warning button is:"+fontcolorautocloseablewarningButton);
		String fontsizeautocloseablewarningButton=autocloseablewarningButton.getCssValue("font-size");
		System.out.println("The font size of the Autocloseable warning button is:"+fontsizeautocloseablewarningButton);
		String fontweightautocloseablewarningButton=autocloseablewarningButton.getCssValue("font-weight");
		System.out.println("The font weight of the Autocloseable warning button is:"+fontweightautocloseablewarningButton);
		
		WebElement normalwarningButton=driver.findElement(By.xpath("//button[@id='normal-btn-warning']"));
		String backgroundcolornormalwarningButton=normalwarningButton.getCssValue("background-color");
		System.out.println("The background color of the Normal warning button is:"+backgroundcolornormalwarningButton);
		String fontcolornormalwarningButton=normalwarningButton.getCssValue("color");
		System.out.println("The font color of the Normal warning button is:"+fontcolornormalwarningButton);
		String fontsizenormalwarningButton=normalwarningButton.getCssValue("font-size");
		System.out.println("The font size of the Normal warning button is:"+fontsizenormalwarningButton);
		String fontweightnormalwarningButton=normalwarningButton.getCssValue("font-weight");
		System.out.println("The font weight of the Normal warning button is:"+fontweightnormalwarningButton);
		
		WebElement autocloseabledangerButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']"));
		String backgroundcolorautocloseabledangerButton=autocloseabledangerButton.getCssValue("background-color");
		System.out.println("The background color of the Autocloseable Danger button is:"+backgroundcolorautocloseabledangerButton);
		String fontcolorautocloseabledangerButton=autocloseabledangerButton.getCssValue("color");
		System.out.println("The  font color of the Autocloseable Danger button is:"+fontcolorautocloseabledangerButton);
		String fontsizeautocloseabledangerButton=autocloseabledangerButton.getCssValue("font-size");
		System.out.println("The  font color of the Autocloseable Danger button is:"+fontsizeautocloseabledangerButton);
		String fontweightautocloseabledangerButton=autocloseabledangerButton.getCssValue("font-weight");
		System.out.println("The  font weight of the Autocloseable Danger button is:"+fontweightautocloseabledangerButton);
		
		WebElement normaldangerButton=driver.findElement(By.xpath("//button[@id='normal-btn-danger']"));
		String backgroundcolornormaldangerButton=normaldangerButton.getCssValue("background-color");
		System.out.println("The background color of the Normal Danger button is:"+backgroundcolornormaldangerButton);
		String fontcolornormaldangerButton=normaldangerButton.getCssValue("color");
		System.out.println("The font color of the Normal Danger button is:"+fontcolornormaldangerButton);
		String fontsizenormaldangerButton=normaldangerButton.getCssValue("font-size");
		System.out.println("The font size of the Normal Danger button is:"+fontsizenormaldangerButton);
		String fontweightnormaldangerButton=normaldangerButton.getCssValue("font-weight");
		System.out.println("The font weight of the Normal Danger button is:"+fontweightnormaldangerButton);
		
		WebElement autocloseableinfoButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']"));
		String backgroundcolorautocloseableinfoButton=autocloseableinfoButton.getCssValue("background-color");
		System.out.println("The background color of the Autocloseable info button is:"+backgroundcolorautocloseableinfoButton);
		String fontcolorautocloseableinfoButton=autocloseableinfoButton.getCssValue("color");
		System.out.println("The font color of the Autocloseable info button is:"+fontcolorautocloseableinfoButton);
		String fontsizeautocloseableinfoButton=autocloseableinfoButton.getCssValue("font-size");
		System.out.println("The font size of the Autocloseable info button is:"+fontsizeautocloseableinfoButton);
		String fontweightautocloseableinfoButton=autocloseableinfoButton.getCssValue("font-weight");
		System.out.println("The font weight of the Autocloseable info button is:"+fontweightautocloseableinfoButton);
		
		WebElement normalinfoButton=driver.findElement(By.xpath("//button[@id='normal-btn-info']"));
		String backgroundcolornormalinfoButton=normalinfoButton.getCssValue("background-color");
		System.out.println("The background color of the Normal info button is:"+backgroundcolornormalinfoButton);
		String fontcolornormalinfoButton=normalinfoButton.getCssValue("color");
		System.out.println("The font color of the Normal info button is:"+fontcolornormalinfoButton);
		String fontsizenormalinfoButton=normalinfoButton.getCssValue("font-size");
		System.out.println("The font size of the Normal info button is:"+fontsizenormalinfoButton);
		String fontweightnormalinfoButton=normalinfoButton.getCssValue("font-weight");
		System.out.println("The font weight of the Normal info button is:"+fontweightnormalinfoButton);
		}
        }
