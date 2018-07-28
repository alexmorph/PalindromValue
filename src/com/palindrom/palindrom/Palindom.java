package com.palindrom.palindrom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindom {

	private int result = getMaximumPalindrom(1000, 2000);

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getMaximumPalindrom(int value1, int value2) {
		List<Integer> palindroms = new ArrayList<>();
		for (int i = value1; i <= value2; i++) {
			for (int j = value1; j <= value2; j++) {
				int res = i * j;
				if (checkPalindrom(res))
					palindroms.add(res);
			}
		}
		return Collections.max(palindroms);
	}

	public boolean checkPalindrom(int result) {
		String valueToString = String.valueOf(result);
		int j = valueToString.length() - 1;
		for (int i = 0; i < valueToString.length() / 2; i++) {
			if (valueToString.charAt(i) == valueToString.charAt(j))
				j--;
			else
				return false;
		}
		return true;
	}

}
