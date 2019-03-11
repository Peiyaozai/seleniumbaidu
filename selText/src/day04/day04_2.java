package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day04_2 {
	@Test

	public void gg() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/dragAndDrop.html";
		driver.get(url);
		WebElement a=driver.findElement(By.id("drag"));
		Actions aa=new Actions(driver);
		aa.dragAndDropBy(a, -200, -30).perform();
}
}