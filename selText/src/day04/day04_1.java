package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day04_1 {
	@Test
	public void gg() throws InterruptedException{

			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="file:///F:/dragAndDrop.html";
			driver.get(url);
			//˫������
//			WebElement a=driver.findElement(By.id("drag"));
//			Actions aa=new Actions(driver);
//			aa.doubleClick(a).perform();
			//�϶����鵽��һ�е�����
			WebElement a=driver.findElement(By.id("drag"));
			WebElement b=driver.findElement(By.xpath("/html/body/h1"));
			Actions aa=new Actions(driver);
			//�������
			aa.clickAndHold(a)
			//�ƶ�
			.moveToElement(b)
			//�ͷ����
			.release(a).perform();

			}
	
}
