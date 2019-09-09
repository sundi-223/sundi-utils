package com.sundi.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilsTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() {

		try {
			String string = StreamUtils.readTextFile(new FileInputStream("E:/test.txt"));

			System.out.println(string);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testReadTextFileFile() {

		String string = StreamUtils.readTextFile(new File("e:/test.txt"));
		System.out.println(string);
	}

}
