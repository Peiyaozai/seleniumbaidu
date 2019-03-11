package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day04_4 {
	@Test

	public void gg() throws InterruptedException, AWTException{

		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/index.html";
		driver.get(url);
		WebElement a=driver.findElement(By.id("user"));
		//µã»÷ctrl¼ü
		Robot b=new Robot();
		b.keyPress(KeyEvent.VK_CONTROL);
		b.keyPress(KeyEvent.VK_S);
		
		b.keyRelease(KeyEvent.VK_S);
		
		b.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		b.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		b.keyRelease(KeyEvent.VK_ESCAPE);
	}
}
