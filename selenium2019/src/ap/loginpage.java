package ap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import ad.loginutil;

public class loginpage extends loginutil{
/*
	public WebElement findElement(By by) { 
		return driver.findElement(by);
	} */
	//打开网址
	public void seturl() {
		 driver.get(Url);
	}

	//用户名
	public void setusername() {
		  driver.findElement(By.name("username")).sendKeys("hujianming");
	}  
	//密码输入
	public void setpassword() {
		 driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	} 
	//选择类型
	public void selectlx() {
		 new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("管理员");
	}
	//点击登录
	public void clicelogin() {
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}

}
