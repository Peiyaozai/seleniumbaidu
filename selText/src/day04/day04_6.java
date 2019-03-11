package day04;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class day04_6 {
	@Test

	public void gg() throws InterruptedException, AWTException, IOException{
		//创建目录
		//FileHandler.createDir(new File("f:\\fff"));
		//拷贝目录
		FileHandler.copy(new File("f:\\模板"),new File("f:\\fff"),"07-龚建成-测试计划.docx");
		//删除
		//FileHandler.delete(new File("f:\\fff\\07-龚建成-测试计划.docx"));
		String gg=FileHandler.readAsString(new File("f:\\fff\\07-龚建成-测试计划.docx"));
		System.out.println(gg);
	}
	}


