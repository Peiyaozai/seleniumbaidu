package ap;

import org.openqa.selenium.By;

import ad.loginutil;

public class classpage extends loginutil{
	//����༶����
	public void addclass()  {
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
	}
	//��������༶
	public void adclass() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
	}
	//�����������
	public void classname() {
		driver.findElement(By.name("b_name")).sendKeys("�����İ�");
		
	}
	//���������ע
	public void classh() {
		driver.findElement(By.name("b_remark")).sendKeys("�������");
	}
	public void submit() {
		driver.findElement(By.cssSelector("#form_branch_add > table > tfoot > tr > td > button.tm_btn.tm_btn_primary")).click();
	}
}
