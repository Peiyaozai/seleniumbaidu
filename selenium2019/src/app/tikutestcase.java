package app;

import org.testng.annotations.Test;

import ad.loginutil;
import add.loginbusiness;
import add.tukubusiness;


public class tikutestcase extends loginutil {
		@Test
	public void login() throws Exception {
			
			loginbusiness a= new loginbusiness();
			a.seturl();
			a.loginb();
			tukubusiness b =new tukubusiness();
			b.gg();
		}
}
