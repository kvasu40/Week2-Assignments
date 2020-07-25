package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {
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
driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("kvvasu");
driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(2000);
driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
boolean ti = driver.findElementByXPath("//div[contains(text(),'View')]").isDisplayed();
if(ti)
	System.out.println(ti);
String tit = driver.getTitle();
System.out.println(tit);
driver.findElementByXPath("//a[text()='Edit']").click();
WebElement vj = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
String vh = vj.getText();
vj.clear();
String Str= "apollo"; 
driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(Str);
driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
String str1 = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
System.out.println(str1);
/*if(str1.contains(Str))
	System.out.println("company name is changed");
else
	System.out.println("company is unchanged");*/
if(!vh.contains(str1))
	System.out.println("Company name is changed");
else
	System.out.println("company name is unchanged");
driver.close();
}
}
