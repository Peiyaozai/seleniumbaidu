package ad;
import java.net.URL;

//�����㣨���в���Ķ��������������ַ��
//@beforeclass   @afterclass���е�����
//ҳ��㣨����ҳ��Ԫ�أ�����������
//ҵ��㣨����Ԫ�صĲ���������������
//�����㣨��¼������ѧ����ִֻ���������������ݣ�
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginutil {

	  public static WebDriver driver;
	  public  static String Url;
	  @BeforeClass
	  public static void setUp() throws Exception {
		 // System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	   // driver = new FirefoxDriver();
		  DesiredCapabilities a=DesiredCapabilities.chrome();
		   driver=new RemoteWebDriver(new URL(" http://192.168.33.1:6161/wd/hub"),a);
	   Url = "http://localhost:8080/examsys/login.thtml";
	  
	   
	  }
	  @AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();
	
	 
	    }
}
