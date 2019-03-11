package day06;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day06_01 {
	@DataProvider(name="add")
	public Object[][] data(){
		return new Object[][]{{"20","40"},{"50","60"},{"10","100"}};
	}
	@Test(dataProvider="add")
	public void Ajia(String test1,String test2) {
		System.out.println(test1+test2);
	}
	@Test(dataProvider="add")
	public void Bjia(String test1,String test2) {
		System.out.println(test1+test2);
	}
	@Test(dataProvider="add")
	public void Cjia(String test1,String test2) {
		System.out.println(test1+test2);
	}
	@Test(dataProvider="add")
	public void Djia(String test1,String test2) {
		System.out.println(test1+test2);
	}
	}

