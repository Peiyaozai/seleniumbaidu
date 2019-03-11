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
		//��������
		public static void setup(){
			System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
			 dr=new ChromeDriver();
			 ur="http://localhost:8080/Exam_ssh/";
		}
		
		@Test
		public void open() throws InterruptedException{
			
			//����ҳ
			dr.get(ur);
			//���� ��ʼ���߿���
			dr.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
			Thread.sleep(1000);
			//�����˺�
			dr.findElement(By.name("stuNumber")).sendKeys("201700005252");
			dr.findElement(By.name("stuName")).sendKeys("�����");
			dr.findElement(By.name("B1")).click();
			Thread.sleep(1000);
			//��ʼ����
			dr.findElement(By.id("start_b")).click();
			//��ѡ��Ŀ
			dr.findElement(By.name("questionOption")).click();
			dr.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
			Thread.sleep(1000);		
			
			
		}
		@AfterClass
		//�ر������
		public static void mm() {
			dr.close();
		}
	}

