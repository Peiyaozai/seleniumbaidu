package ap;

import org.openqa.selenium.By;

import ad.loginutil;

public class tikupage  extends loginutil {
	//���������&����������
	public void  clicktiku() {
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}
//����������
	public void clicktname() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("123gjc");
	}
	//������˵��
	public void clickts() {
		driver.findElement(By.name("d_remark")).sendKeys("woshigjc");
	}
	//����ύ
	public void submit() {
		driver.findElement(By.cssSelector("#form_qdb_add > table > tfoot > tr > td > button.tm_btn.tm_btn_primary")).click();
	}
}
