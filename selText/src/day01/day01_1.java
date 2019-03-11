package day01;

import java.awt.Dimension;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day01_1 {
	@Test
public void open() throws InterruptedException  {
		//打开火狐浏览器
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		String url2="https://www.v2ex.com";
		driver.get(url);
		//窗口最大化
		driver.manage().window().maximize();
		//设置浏览器大小
		Thread.sleep(1000);
		Dimension dimension=new Dimension(500,100);
		//刷新页面
		driver.navigate().refresh();
		driver.navigate().to(url2);
		driver.navigate().back();
	String title=driver.getTitle();
	System.out.println(title);
	String url11=driver.getCurrentUrl();
	System.out.println(url11);
		Thread.sleep(1000);
		driver.navigate().forward();
		String title2=driver.getTitle();
	System.out.println(title2);	
	String url12=driver.getCurrentUrl();
	System.out.println(url12);
	}
	
}
