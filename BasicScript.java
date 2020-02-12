package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {
public static void main(String[] args) {

// declaration and instantiation of objects/variables
System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
String baseUrl = "http://www.foxnews.com/";
String expectedTitle = "Fox News - Breaking News Updates | Latest News Headlines | Photos & News Videos";
String actualTitle = "";

// launch Fire fox and direct it to the Base URL
driver.get(baseUrl);

// get the actual value of the title
actualTitle = driver.getTitle();
if (actualTitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
} else {
System.out.println("Test Failed");
}
//close Fire fox
driver.close();
}
}
