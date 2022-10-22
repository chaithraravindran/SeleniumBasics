package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SubmitFormButtonIfCondition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement Submitformbutton=driver.findElement(By.xpath("//button[text()='Submit form']"));
		String actualText=Submitformbutton.getText();
		//System.out.println("The actual text in the button is:" +actualText);
		String expectedText="Submit form"; 
		if(expectedText.equals(actualText)){
			System.out.println("The text in the button is Submit form");}
		else {
			System.out.println("The text in the button is not Submit form");}
		WebElement enterFirstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		enterFirstname.sendKeys("Anu");
		WebElement enterLastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		enterLastname.sendKeys("Antony");
		WebElement enterUsername=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		enterUsername.sendKeys("anu.antony@gmail.com");
		WebElement enterCity=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		enterCity.sendKeys("Trivandrum");
		WebElement enterState=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		enterState.sendKeys("Kerala");
		WebElement enterZip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		enterZip.sendKeys("695001");
		WebElement clickAgreetotermsandconditions=driver.findElement(By.xpath("//label[contains(text(),'Agree to terms and conditions')]"));
		clickAgreetotermsandconditions.click();
		Submitformbutton.click();
		String expectedMessage="Form has been submitted successfully!";
		WebElement formSuccessfullysubmittedmessage=driver.findElement(By.xpath("//div[text()='Form has been submitted successfully!']"));
		String actualMessage=formSuccessfullysubmittedmessage.getText();
		if(expectedMessage.equals(actualMessage)) {
			System.out.println("Form has been submitted successfully");}
		else{
			System.out.println("Form has not been submitted successfully");}
	}}
