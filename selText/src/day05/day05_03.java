package day05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day05_03 {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void aa() {
		/*
		 * 定义网址
		 */
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		 url="http://localhost:8080/Banksys_ssh";
	}
	@Test
	@Parameters("test1")
	public void bgg(String test1) throws InterruptedException{

			
			driver.get(url);
			//登入
			driver.findElement(By.name("userNO")).sendKeys("1545631436180");
			driver.findElement(By.name("password")).sendKeys(test1);
			driver.findElement(By.id("loginValidate_0")).click();}
	@Test
	//@Parameters("test1")
	public void cc() {
			driver.switchTo().frame("leftFrame");//定位
			driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();//点击
			driver.switchTo().parentFrame();//返回页面
			driver.switchTo().frame("mainFrame");//定位框
			//选择输入框并输入数据
			driver.findElement(By.name("money")).sendKeys("10000");//输入
			driver.findElement(By.id("smoneyValidate_0")).click();//点击
			driver.switchTo().parentFrame();
			driver.switchTo().frame("leftFrame");
			driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("mainFrame");
			//打印交易信息
			String gg=driver.findElement(By.xpath("/html/body/center/table")).getText();
			System.out.println(gg);
}
	@AfterClass
	public static void mm() {
		driver.close();
	}
}
