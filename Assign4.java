package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
driver.manage().window().maximize();
driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
}
}
