package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day06_03 {
	

	
	
		
		static WebDriver dr;
		static String ur;
		
		@BeforeClass
		//设置链接
		public static void setup(){
			System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
			 dr=new ChromeDriver();
			 ur="http://localhost:8080/Exam_ssh/";
		}
		
		@Test
		public void open() throws InterruptedException{
			
			//打开网页
			dr.get(ur);
			//进入 开始在线考试
			dr.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
			Thread.sleep(1000);
			//输入账号
			dr.findElement(By.name("stuNumber")).sendKeys("201700005252");
			dr.findElement(By.name("stuName")).sendKeys("工间操");
			dr.findElement(By.name("B1")).click();
			Thread.sleep(1000);
			//开始考试
			dr.findElement(By.id("start_b")).click();
			//勾选题目
			dr.findElement(By.name("questionOption")).click();
			dr.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
			Thread.sleep(1000);		
			
			
		}
		@AfterClass
		//关闭浏览器
		public static void mm() {
			dr.close();
		}
	}

