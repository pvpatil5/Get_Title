package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 
{

	@Test
	public void testSampl()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/exe/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http:www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}



}
