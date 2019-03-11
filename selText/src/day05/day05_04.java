package day05;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day05_04 {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void astep(){
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		url="http://localhost:8080/Banksys_ssh";
		
		}
	@Test
	public void bgg() throws InterruptedException{

//			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
//			WebDriver driver=new ChromeDriver();
//			String url="http://localhost:8080/Banksys_ssh";
			//打开网址
			
			//登入
		driver.get(url);
			driver.findElement(By.name("userNO")).sendKeys("1545631436180");
			driver.findElement(By.name("password")).sendKeys("123456");
			driver.findElement(By.id("loginValidate_0")).click();
			}
	@Test(dependsOnMethods="bgg")
	@Parameters("data1")
			public void cqq(String data1) {
			//选中区域
			driver.switchTo().frame("leftFrame");
			//选择按钮
			driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
			//跳回主页面
			driver.switchTo().parentFrame();
			driver.switchTo().frame("mainFrame");
			//选中输入框进行输入
			driver.findElement(By.name("money")).sendKeys(data1);
			driver.switchTo().parentFrame();
			driver.switchTo().frame("leftFrame");
			driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("mainFrame");
			//打印第一次交易信息
			String gg=driver.findElement(By.xpath("/html/body/center/table")).getText();
			System.out.println(gg);
			}
	@Test(dependsOnMethods="cqq")
	@Parameters("data1")
			public void dgjk(String data1) {
			//跳回主页面
			driver.switchTo().parentFrame();
			//选择左边框架s
			driver.switchTo().frame("leftFrame");
			//选中按钮
			driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("mainFrame");
			//选择输入框并输入数据
			driver.findElement(By.name("money")).sendKeys(data1);
			driver.findElement(By.id("fmoneyValidate_0")).click();
			//打印第二次错误信息
			String pp=driver.findElement(By.xpath("/html/body/center")).getText();
			System.out.println(pp);
			
}
			@AfterClass
			public static void mm() {
				driver.close();
			}
}
