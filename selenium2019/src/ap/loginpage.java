package ap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import ad.loginutil;

public class loginpage extends loginutil{
/*
	public WebElement findElement(By by) { 
		return driver.findElement(by);
	} */
	//����ַ
	public void seturl() {
		 driver.get(Url);
	}

	//�û���
	public void setusername() {
		  driver.findElement(By.name("username")).sendKeys("hujianming");
	}  
	//��������
	public void setpassword() {
		 driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	} 
	//ѡ������
	public void selectlx() {
		 new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("����Ա");
	}
	//�����¼
	public void clicelogin() {
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}

}
