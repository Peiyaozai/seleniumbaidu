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
	in.sendKeys("����");
	//�����µ�ҳǩ
	driver.findElement(By.linkText("Open new window")).click();
	//��ȡ��ǰҳ������о��,��ǰ������ҳ��
	//��������һ���ַ��������������������
	Set<String>w=driver.getWindowHandles();
	for(String handle:w) {
		//��תֻ�þ������ҳ��
		driver.switchTo().window(handle);
		String title =driver.getTitle();
		//ͨ�������жϣ�����ȡ��ҳ���Ƿ�������Ҫ��
		//���������Ҫ�ģ��ͶԸ�ҳ�棬���в���
		if("UIAutomation iFrame".equals(title)) {
			Thread.sleep(2000);
			driver.findElement(By.id("user")).sendKeys("mdzz");
			
		}
	}

	
}
}
