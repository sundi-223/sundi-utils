package com.sundi.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testHasLength() {
	}

	@Test
	public void testHasText() {
	}

	@Test
	public void testRandomChineseString() {
		for (int i = 0; i < 10; i++) {
			String string = StringUtils.randomChineseString();
			System.out.print(string + " ");
		}
	}

	@Test
	public void testRandomChineseString2() {
		for (int i = 0; i < 10; i++) {
			String string = StringUtils.randomSimpleChinese();
			System.out.print(string + " ");
		}

	}

	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtils.randomChineseString(10);
		System.out.println(string);

	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String string = StringUtils.generateChineseName();
			System.out.println(string);
		}
	}

	@Test
	public void genderatePerson() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);

		for (int i = 0; i < 10000; i++) {
			Person person = new Person(StringUtils.generateChineseName(), RandomUtils.random(1, 120),
					StringUtils.randomChineseString(140), DateUtils.randomDate(c.getTime(), new Date()));
			System.out.println(person);
		}

	}
}
