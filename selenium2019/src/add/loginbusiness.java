package add;

import ap.loginpage;

public class loginbusiness extends loginpage{
	public void loginb() throws InterruptedException {
 loginpage s=new loginpage();
 
 s.setusername();
 s.setpassword();
 s.selectlx();
 Thread.sleep(8000);
 s.clicelogin();
 Thread.sleep(8000);

	}
}
