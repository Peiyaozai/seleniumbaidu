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
			//��תֻ�þ������ҳ��
			driver.switchTo().window(handle);
			String title =driver.getTitle();
			//ͨ�������жϣ�����ȡ��ҳ���Ƿ�������Ҫ��
			//���������Ҫ�ģ��ͶԸ�ҳ�棬���в���
			if("�ٶ�һ�£����֪��".equals(title)) {
				Thread.sleep(2000);
				driver.findElement(By.id("kw")).sendKeys("mdzz");
				driver.findElement(By.id("su")).click();
				
			}
		}
		driver.switchTo().window(ad);
}
}
