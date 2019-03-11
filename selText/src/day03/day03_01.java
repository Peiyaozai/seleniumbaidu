package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day03_01 {
@Test
public void cc() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/index.html";
	driver.get(url);
	WebElement in=driver.findElement(By.id("user"));
	in.sendKeys("公告");
	//打开了新的页签
	driver.findElement(By.linkText("Open new window")).click();
	//获取当前页面的所有句柄,当前有两个页面
	//所以用了一个字符串集合来接受两个句柄
	Set<String>w=driver.getWindowHandles();
	for(String handle:w) {
		//跳转只该句柄的网页中
		driver.switchTo().window(handle);
		String title =driver.getTitle();
		//通过标题判断，所获取的页面是否是我想要的
		//如果是我想要的，就对该页面，进行操作
		if("UIAutomation iFrame".equals(title)) {
			Thread.sleep(2000);
			driver.findElement(By.id("user")).sendKeys("mdzz");
			
		}
	}

	
}
}
