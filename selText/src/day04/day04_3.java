package day04;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day04_3 {
	@Test

	public void gg() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/index.html";
		driver.get(url);
		//多选下拉框
		WebElement a=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
		//获取选择内容
		List<WebElement> option=a.findElements(By.tagName("option"));
		Actions aa=new Actions(driver);
		//a.sendKeys(Keys.CONTROL);
		aa.keyDown(Keys.CONTROL)
		.click(option.get(1))
		.click(option.get(3)).perform();
	}
}
