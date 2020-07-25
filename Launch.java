package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElementById("username").sendKeys("demosalesmanager");
driver.findElementByName("PASSWORD").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("gorilla");
driver.findElementById("createLeadForm_firstName").sendKeys("vasudeva");
driver.findElementById("createLeadForm_lastName").sendKeys("k");
WebElement source = driver.findElementById("createLeadForm_dataSourceId");
Select dropdown = new Select(source);
dropdown.selectByVisibleText("Employee");
WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
Select dropbox = new Select(marketingcampaign);
dropbox.selectByValue("9001");
WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
Select dropmenu = new Select(industry);
dropmenu.selectByIndex(17-2);
WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
Select drop = new Select(ownership);
drop.selectByIndex(5);
WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
Select dropsymbol = new Select(country);
dropsymbol.selectByVisibleText("India");
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876543210");
driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("mrperfect1000@gmail.com");
driver.findElementByName("submitButton").click();
System.out.println(driver.getTitle());
}

}
