package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day03_02 {
@Test
public void gg() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/pop.html";
		
		driver.get(url);
		String ad=driver.getWindowHandle();
		driver.findElement(By.id("goo")).click();
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			//跳转只该句柄的网页中
			driver.switchTo().window(handle);
			String title =driver.getTitle();
			//通过标题判断，所获取的页面是否是我想要的
			//如果是我想要的，就对该页面，进行操作
			if("百度一下，你就知道".equals(title)) {
				Thread.sleep(2000);
				driver.findElement(By.id("kw")).sendKeys("mdzz");
				driver.findElement(By.id("su")).click();
				
			}
		}
		driver.switchTo().window(ad);
}
}
