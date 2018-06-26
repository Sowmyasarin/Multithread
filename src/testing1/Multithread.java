package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multithread extends Thread
{
		public void run()
		{
		   //OPen Chromebrowser
		   System.setProperty("webdriver.chrome.driver","E:\\batch238\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   //Launch site
		   driver.get("http://google.co.in");
		  // Thread.sleep(6000);
		   driver.close();
		}
		public static void main(String[] args) throws Exception
		{
		Multithread obj=new Multithread();
		obj.start();
		System.setProperty("webdriver.chrome.driver","E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.findElement(By.name("q")).sendKeys("github",Keys.ENTER);
		Thread.sleep(5000);
		driver.close();		
		
		
		
			
		}
		
	}
		
