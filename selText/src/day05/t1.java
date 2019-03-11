package day05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class t1 {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void astep(){
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		url="http://localhost:8080/Exam_ssh/";
	}
@Test
public void Agg() throws InterruptedException{

		
		driver.get(url);//打开网页
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();//点击后台管理
			driver.findElement(By.name("name")).sendKeys("admin");//输入账号
			driver.findElement(By.name("password")).sendKeys("admin");//输入密码
			driver.findElement(By.name("B1")).click();//点击提交
	}
	@Test(dependsOnMethods="Agg")
			public void Bee() {
			driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();//点击添加考试类型
			driver.findElement(By.id("testName")).sendKeys("语文");//添加考试科目
		driver.findElement(By.id("testTime")).sendKeys("120min");//添加考试时间
			driver.findElement(By.name("submit")).click();//点击确定
			driver.findElement(By.id("title")).sendKeys("hahaha");//输入题目
			driver.findElement(By.id("choices")).sendKeys("1:哈哈 2:嘿嘿");//输入选项
		driver.findElement(By.id("standardAnswer")).sendKeys("1:2:");//输入答案
			driver.findElement(By.name("submit")).click();//点击提交
			driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();//点击查看所有试题
			String a=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();//获取试题
			System.out.println(a);//打印试题
			}
		@Test
		public void Cff() {
			
			driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();//点击添加学生
			//输入数据
			driver.findElement(By.id("id")).sendKeys("362202199905161191");
			driver.findElement(By.id("stuNumber")).sendKeys("201700005252");
			driver.findElement(By.id("realname")).sendKeys("工间操");
			driver.findElement(By.name("className")).sendKeys("170304");
			driver.findElement(By.name("phone")).sendKeys("13807063152");
			driver.findElement(By.className("Sborder")).sendKeys("sssssssssssss");
			driver.findElement(By.id("address")).sendKeys("江西丰城");
			driver.findElement(By.id("email")).sendKeys("GG");
			//点击提交
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();//点击查看全部学生
			String b=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();//获取学生信息
			System.out.println(b);//打印学生信息
}
	@AfterClass
	public static void mm() {
		driver.close();
	}
}
