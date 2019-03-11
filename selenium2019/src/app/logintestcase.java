package app;

import org.testng.annotations.Test;

import ad.loginutil;
import add.classbusiness;
import add.loginbusiness;

public class logintestcase extends loginutil{
	@Test
public void login() throws Exception {
		
		loginbusiness a= new loginbusiness();
		a.seturl();
		a.loginb();
		/*tukubusiness b =new tukubusiness();
		b.gg();*/
		classbusiness b=new classbusiness();
		b.jj();
	
	}
}
