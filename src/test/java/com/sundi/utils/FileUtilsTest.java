package com.sundi.utils;

import java.io.File;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void testGetExtendName() {
		String file = "abc.doc";
		String name = FileUtils.getExtendName(file);
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtils.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {

		File file = FileUtils.getUserDirectory();
		System.out.println(file);

	}

}
