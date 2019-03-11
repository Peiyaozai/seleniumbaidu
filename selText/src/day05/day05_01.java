package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day05_01 {
	@Before
	public void dd() {
		System.out.println("这是@before");
	}
	@Test

	public void gg() {

//	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	System.out.println("这是第一个@test");
}
	@Test
	public void bb() {
		System.out.println("这是第二个@test");
	}
	@After
	public void jj() {
		System.out.println("这是@after");
	}
}