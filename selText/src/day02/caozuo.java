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
		//������ַ
		String url="file:///C:/Users/17515/Documents/Tencent%20Files/1751584212/FileRecv/index.html\r\n" ;
	//�����������ַ
		driver.get(url);
		WebElement input=driver.findElement(By.id("user"));
		input.sendKeys("�ؼ�����");
		WebElement s=driver.findElement(By.id("moreSelect"));
		Select s1=new Select(s);
		//��һ�ַ�ʽ������������ѡ����һ��ѡ������ݴ��㿪ʼ
		//s1.selectByIndex(3);
		//�ڶ��ַ�ʽ��by.value
		//s1.selectByValue("xiaomi");
		//�����ַ�ʽ��ͨ���ɼ���ֵ
		s1.selectByVisibleText("xiaomi");
		WebElement r1=driver.findElement(By.className("Saab"));
		System.out.println(r1.isSelected());
		r1.click();
		System.out.println(r1.isSelected());
		WebElement r3=driver.findElement(By.name("checkbox1"));
		//�����ťû�б�ѡ����ô��ѡ����
		if(!r3.isSelected()) {
		r3.click();}
		System.out.println(r3.isSelected());
		WebElement r2=driver.findElement(By.name("checkbox2"));
		r2.click();
		WebElement b1=driver.findElement(By.name("buttonhtml"));
		System.out.println(b1.isEnabled());
		//���alert��ť
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		//���������ת����������ȥ
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		WebElement a2=driver.findElement(By.className("confirm"));
		a2.click();
		Alert cle=driver.switchTo().alert();
		Thread.sleep(1000);
		//cle.accept();//ȷ��
		cle.dismiss();//ȡ��
		Thread.sleep(1000);
		cle.accept();
		//������ٵ����ť
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
		//����·��
		String lu="F:\\gjc.class";
		WebElement up=driver.findElement(By.id("load"));
		up.sendKeys(lu);
		
	}

}
