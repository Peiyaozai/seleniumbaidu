package day04;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class day04_6 {
	@Test

	public void gg() throws InterruptedException, AWTException, IOException{
		//����Ŀ¼
		//FileHandler.createDir(new File("f:\\fff"));
		//����Ŀ¼
		FileHandler.copy(new File("f:\\ģ��"),new File("f:\\fff"),"07-������-���Լƻ�.docx");
		//ɾ��
		//FileHandler.delete(new File("f:\\fff\\07-������-���Լƻ�.docx"));
		String gg=FileHandler.readAsString(new File("f:\\fff\\07-������-���Լƻ�.docx"));
		System.out.println(gg);
	}
	}


