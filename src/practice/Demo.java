package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(7000);
		driver.close();
	}

}
