package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day05_01 {
	@Before
	public void dd() {
		System.out.println("����@before");
	}
	@Test

	public void gg() {

//	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	System.out.println("���ǵ�һ��@test");
}
	@Test
	public void bb() {
		System.out.println("���ǵڶ���@test");
	}
	@After
	public void jj() {
		System.out.println("����@after");
	}
}