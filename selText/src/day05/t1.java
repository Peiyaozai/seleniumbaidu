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

		
		driver.get(url);//����ҳ
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();//�����̨����
			driver.findElement(By.name("name")).sendKeys("admin");//�����˺�
			driver.findElement(By.name("password")).sendKeys("admin");//��������
			driver.findElement(By.name("B1")).click();//����ύ
	}
	@Test(dependsOnMethods="Agg")
			public void Bee() {
			driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();//�����ӿ�������
			driver.findElement(By.id("testName")).sendKeys("����");//��ӿ��Կ�Ŀ
		driver.findElement(By.id("testTime")).sendKeys("120min");//��ӿ���ʱ��
			driver.findElement(By.name("submit")).click();//���ȷ��
			driver.findElement(By.id("title")).sendKeys("hahaha");//������Ŀ
			driver.findElement(By.id("choices")).sendKeys("1:���� 2:�ٺ�");//����ѡ��
		driver.findElement(By.id("standardAnswer")).sendKeys("1:2:");//�����
			driver.findElement(By.name("submit")).click();//����ύ
			driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();//����鿴��������
			String a=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();//��ȡ����
			System.out.println(a);//��ӡ����
			}
		@Test
		public void Cff() {
			
			driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();//������ѧ��
			//��������
			driver.findElement(By.id("id")).sendKeys("362202199905161191");
			driver.findElement(By.id("stuNumber")).sendKeys("201700005252");
			driver.findElement(By.id("realname")).sendKeys("�����");
			driver.findElement(By.name("className")).sendKeys("170304");
			driver.findElement(By.name("phone")).sendKeys("13807063152");
			driver.findElement(By.className("Sborder")).sendKeys("sssssssssssss");
			driver.findElement(By.id("address")).sendKeys("�������");
			driver.findElement(By.id("email")).sendKeys("GG");
			//����ύ
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();//����鿴ȫ��ѧ��
			String b=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();//��ȡѧ����Ϣ
			System.out.println(b);//��ӡѧ����Ϣ
}
	@AfterClass
	public static void mm() {
		driver.close();
	}
}
