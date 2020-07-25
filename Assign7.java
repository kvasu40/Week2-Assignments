package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {
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
driver.findElementByXPath("//span[text()='Email']").click();
driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("mrperfect1000@gmail.com");
driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(2000);
driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
String t1 = driver.findElementByXPath("(//span[@class='tabletext'])[4]").getText();
driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
String Ver="Duplicate Lead";
String tit = driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
if(tit.equals(Ver))
	System.out.println("Title is Duplicate Lead");
driver.findElementByXPath("//input[@class='smallSubmit']").click();
String t2 = driver.findElementByXPath("(//span[@class='tabletext'])[4]").getText();
if(t1.equals(t2))
System.out.println("Duplication is same");
driver.close();
	}
}