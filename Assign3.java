package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get(" http://leafground.com/pages/radio.html");
driver.manage().window().maximize();
//driver.findElementByXPath("//label[text()='Are you enjoying the classes?']");
driver.findElementByXPath("//input[@id='yes']").click();
	driver.findElementByXPath("(//input[@name='news'])[2]").isSelected();
	driver.findElementByXPath("(//input[@name='news'])[1]").isSelected();
	driver.findElementByXPath("(//input[@class='myradio' and @value='1'])[2]").isSelected();
	}
	}