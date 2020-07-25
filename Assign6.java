package week2.day1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
	driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
    driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
    driver.findElementByXPath("//a[text()='Leads']").click();
    driver.findElementByXPath("//a[text()='Find Leads']").click();
    driver.findElementByXPath("//span[text()='Phone']").click();
    driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9876543210");
    driver.findElementByXPath("//button[text()='Find Leads']").click();
    Thread.sleep(2000);
   String tt = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
   driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
     driver.findElementByXPath("//a[text()='Delete']").click();
    driver.findElementByXPath("//a[text()='Find Leads']").click();
   //driver.findElementByXPath("//a[text()='Find Leads']").click();
    driver.findElementByXPath("//input[@name='id']").sendKeys(tt);
    driver.findElementByXPath("//button[text()='Find Leads']").click();
    Thread.sleep(2000);
    String st = "No records to display";
    String t = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
    if(t.equals(st))
    	System.out.println("Record is deleted");
    else
    	System.out.println("record is still there");
    driver.close();
    }
}