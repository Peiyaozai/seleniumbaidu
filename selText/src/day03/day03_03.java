package day03;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day03_03 {	

	@Test
	public void gg() throws InterruptedException{

			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="file:///F:/index.html";
			
			driver.get(url);
			driver.switchTo().frame("aa");
			driver.findElement(By.id("user")).sendKeys("GG");
			//���ص���ҳ��
			//���ص���ҳ����
			//��ҳ��----iFrame---iframe
			//driver.switchTo().parentFrame();
			//ֱ�����������
			driver.switchTo().defaultContent();
			driver.findElement(By.id("user")).sendKeys("adaa");
	}
	
}
