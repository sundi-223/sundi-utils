package com.sundi.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilsTest {

	@Test
	public void testRandom() {
	}

	@Test
	public void testSubRandom() {
		//获取从1-120岁之间的10个随机年龄
		int[] is = RandomUtils.subRandom(1, 120, 10);
		for (int i : is) {
			System.out.println(i);
			
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i =0;i<4;i++) {
			System.out.print(RandomUtils.randomCharacter());
		}
	}

	@Test
	public void testRandomString() {
		
		System.out.print(RandomUtils.randomString(6));
	}

}
