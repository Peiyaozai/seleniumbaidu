package day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day03_06 {
	@Test
	public void gg() throws InterruptedException{

			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="file:///F:/index.html";
			driver.get(url);
//			WebElement input=driver.findElement(By.id("user"));
//			Actions ac=new Actions(driver);
//			//ac.contextClick(input).perform();
//			ac.contextClick().perform();
			WebElement gg=driver.findElement(By.className("over"));
			gg.click();
			Actions db=new Actions(driver);
			db.moveToElement(gg).perform();
			String a=driver.findElement(By.id("over")).getText();
			System.out.println(a);
	}
}
