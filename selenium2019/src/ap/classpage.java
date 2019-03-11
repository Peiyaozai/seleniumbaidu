package ap;

import org.openqa.selenium.By;

import ad.loginutil;

public class classpage extends loginutil{
	//点击班级管理
	public void addclass()  {
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
	}
	//点击新增班级
	public void adclass() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
	}
	//输入机构名称
	public void classname() {
		driver.findElement(By.name("b_name")).sendKeys("测试四班");
		
	}
	//输入机构备注
	public void classh() {
		driver.findElement(By.name("b_remark")).sendKeys("天气真好");
	}
	public void submit() {
		driver.findElement(By.cssSelector("#form_branch_add > table > tfoot > tr > td > button.tm_btn.tm_btn_primary")).click();
	}
}
