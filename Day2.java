package week2.day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Day2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
    driver.findElementByXPath("//input[@class='inputLogin' and @id='username']").sendKeys("demosalesmanager");
	driver.findElementByXPath("//input[@class='inputLogin' and @id='password']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
	driver.findElementByXPath("//a[text()='Create Lead']").click();
	driver.findElementByXPath("//input[@id = 'createLeadForm_companyName']").sendKeys("TCS");
	driver.findElementByXPath("//input[@id = 'createLeadForm_firstName']").sendKeys("kvvasu");
	driver.findElementByXPath("//input[@id = 'createLeadForm_lastName']").sendKeys("naidu");
	WebElement source = driver.findElementByXPath("//select[@id= 'createLeadForm_dataSourceId']");
	Select dropdown = new Select(source);
	dropdown.selectByVisibleText("Employee");
	driver.findElementByXPath("//input[@name='submitButton']").click();
	}

	}
