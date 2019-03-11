package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class caozuo {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//输入网址
		String url="file:///C:/Users/17515/Documents/Tencent%20Files/1751584212/FileRecv/index.html\r\n" ;
	//用浏览器打开网址
		driver.get(url);
		WebElement input=driver.findElement(By.id("user"));
		input.sendKeys("控件操作");
		WebElement s=driver.findElement(By.id("moreSelect"));
		Select s1=new Select(s);
		//第一种方式，按照索引来选，第一个选择的内容从零开始
		//s1.selectByIndex(3);
		//第二种方式，by.value
		//s1.selectByValue("xiaomi");
		//第三种方式，通过可见的值
		s1.selectByVisibleText("xiaomi");
		WebElement r1=driver.findElement(By.className("Saab"));
		System.out.println(r1.isSelected());
		r1.click();
		System.out.println(r1.isSelected());
		WebElement r3=driver.findElement(By.name("checkbox1"));
		//如果按钮没有被选择，那么就选择他
		if(!r3.isSelected()) {
		r3.click();}
		System.out.println(r3.isSelected());
		WebElement r2=driver.findElement(By.name("checkbox2"));
		r2.click();
		WebElement b1=driver.findElement(By.name("buttonhtml"));
		System.out.println(b1.isEnabled());
		//点击alert按钮
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		//从浏览器跳转到弹出框上去
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		WebElement a2=driver.findElement(By.className("confirm"));
		a2.click();
		Alert cle=driver.switchTo().alert();
		Thread.sleep(1000);
		//cle.accept();//确定
		cle.dismiss();//取消
		Thread.sleep(1000);
		cle.accept();
		//输入后，再点击按钮
		WebElement p1=driver.findElement(By.className("prompt"));
		p1.click();
		Alert pp1=driver.switchTo().alert();
		Thread.sleep(1000);
		pp1.sendKeys("hello,peiyao");
//		String p=pp1.getText();
//		System.out.println(p);
		Thread.sleep(1000);
		pp1.accept();
		Thread.sleep(1000);
		pp1.accept();
		//定义路径
		String lu="F:\\gjc.class";
		WebElement up=driver.findElement(By.id("load"));
		up.sendKeys(lu);
		
	}

}
