package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day03_05 {

	
	@Test
	public void gg() throws InterruptedException{

			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			String url="file:///F:/index.html";
			driver.get(url);
			driver.findElement(By.className("wait"));
			//Thread.sleep(3000);
			String aa=driver.findElement(By.className("red")).getText();
			System.out.println(aa);
	}
}
