package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zuoye_1 {
@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/autotest.html";
	driver.get(url);
	WebElement p=driver.findElement(By.name("account"));
	p.sendKeys("peiyao");
	WebElement p1=driver.findElement(By.name("password"));
	p1.sendKeys("0527");
	WebElement p2=driver.findElement(By.id("areaID"));
	Select g=new Select(p2);
	g.selectByValue("tianjin");
	WebElement p3=driver.findElement(By.id("sexID1"));
	p3.click();
	WebElement p4=driver.findElement(By.id("u3"));
	p4.click();
	WebElement p5=driver.findElement(By.id("u4"));
	p5.click();
	String lu="F:\\gjc.class";
	WebElement p6=driver.findElement(By.name("file"));
	p6.sendKeys(lu);
	WebElement p7=driver.findElement(By.id("buttonID"));
	p7.click();
	Alert pp1=driver.switchTo().alert();
	pp1.accept();
	}
}
