package week2.day1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Button.html");
WebElement ho = driver.findElementById("home");	
ho.click();
driver.get("http://leafground.com/pages/Button.html");
WebElement posi = driver.findElementById("position");
Point location = posi.getLocation();
System.out.println(location);
//String cssValue = driver.findElementById("color").getCssValue("background-color");
//System.out.println(cssValue);
WebElement color = driver.findElementById("color");
String co = color.getCssValue("background-color");
System.out.println(co);
Dimension si = driver.findElementById("size").getSize();
System.out.println(si);
driver.close();
}
}
