package day03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day03_04 {
	@Test
	public void gg() throws InterruptedException{

			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="file:///F:/frame.html";
			driver.get(url);
			//selenium½ØÍ¼
			File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(jietu, new File("F:/1.gif"));
			}catch(IOException e) {
				e.printStackTrace();
			}
			driver.switchTo().frame("frame");
			driver.findElement(By.id("input1")).sendKeys("gg");
			driver.switchTo().defaultContent();
			String a=driver.findElement(By.id("id1")).getText();
			System.out.println(a);
	}
}
