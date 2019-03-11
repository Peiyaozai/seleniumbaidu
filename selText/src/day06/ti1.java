package day06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ti1 {
	

	
	
	
	static WebDriver dr;
	static String ur;
	
	@BeforeClass
	//��������
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		 dr=new ChromeDriver();
		 ur="http://localhost:8080/shop1/";
	}
	@Test
	public void open() throws InterruptedException{
		
		//����ҳ
		dr.get(ur);
		//�����˺�����
		dr.findElement(By.name("c_name")).sendKeys("aaaaaa");
		dr.findElement(By.name("c_pass")).sendKeys("aaa");
		//���ȷ��
		dr.findElement(By.className("STYLE1")).click();
	}
	@Test
	public void select() throws InterruptedException {
		WebElement s=dr.findElement(By.name("select_type"));
		Select s1=new Select(s);
		//��������ѡ���һ������ר��
		s1.selectByIndex(1);
		//�������
		dr.findElement(By.name("Submit")).click();
		//�������
		dr.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/input")).click();
		//����������Ʒ������
		dr.findElement(By.name("select_p_name")).sendKeys("����");
		dr.findElement(By.name("Submit")).click();
		Alert alert=dr.switchTo().alert();
		alert.accept();
		//������Ʒ������Ʒ���ͽ��о�ȷ����
		Thread.sleep(3000);
		dr.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
		WebElement b=dr.findElement(By.name("select_type"));
		Select b1=new Select(b);
		b1.selectByIndex(1);
		dr.findElement(By.name("select_p_name")).sendKeys("����");
		dr.findElement(By.name("Submit")).click();
		dr.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/input")).click();
	}
	@AfterClass
	public void quit() {
		dr.close();
	}
}
