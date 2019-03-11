package ad;
import java.net.URL;

//基础层（所有不变的东西：浏览器，网址）
//@beforeclass   @afterclass所有的内容
//页面层（所有页面元素，放在这个包里）
//业务层（所有元素的操作，放在这个包里）
//用例层（登录，新增学生；只执行这个包里面的内容）
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
