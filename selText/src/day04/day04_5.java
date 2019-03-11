package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day04_5 {
	@Test

	public void gg() throws InterruptedException, AWTException{

		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/index.html";
		driver.get(url);
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_F12);
		a.keyRelease(KeyEvent.VK_F12);
	}
}
