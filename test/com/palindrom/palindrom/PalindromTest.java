package com.palindrom.palindrom;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PalindromTest {
	
	@Test
	public void checkValueIsPalindrom() {
	Palindom obj = new Palindom();
    boolean flag = obj.checkPalindrom(880088);
    Assert.assertTrue(flag);
	}

	@Test
	public void checkValueIsNotPalindrom() {
	Palindom obj = new Palindom();
    boolean flag = obj.checkPalindrom(860088);
    Assert.assertFalse(flag);
	}
	
	@Test
	public void findMaxPalindromValue() {
	Palindom obj = new Palindom();
	int value1 = 1000, value2 = 2000;
    int result = obj.getMaximumPalindrom(value1, value2);
    Assert.assertEquals(3848483, result);
	}
	
}
