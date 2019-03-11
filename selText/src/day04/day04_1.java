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
			//双击方块
//			WebElement a=driver.findElement(By.id("drag"));
//			Actions aa=new Actions(driver);
//			aa.doubleClick(a).perform();
			//拖动方块到第一行的字上
			WebElement a=driver.findElement(By.id("drag"));
			WebElement b=driver.findElement(By.xpath("/html/body/h1"));
			Actions aa=new Actions(driver);
			//点击不放
			aa.clickAndHold(a)
			//移动
			.moveToElement(b)
			//释放鼠标
			.release(a).perform();

			}
	
}
