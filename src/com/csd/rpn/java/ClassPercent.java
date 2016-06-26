package com.csd.rpn.java;

import java.util.StringTokenizer;

public class ClassPercent {

	public double calculate(String string) throws Exception {

		String perChar;
		double perNumber, perPercentage;
		String[] splitStr = string.trim().split("\\s+");

		try {
			perNumber = Double.valueOf(splitStr[0]);
		} catch (Exception es) {
			throw new Exception("Invalid Expression 1");

		}

		try {
			perChar = splitStr[1];
		} catch (Exception es) {
			throw new Exception("Invalid Expression 2");
		}

		if (perChar.equals("%")) {
			perPercentage = perNumber / 100;
			System.out.println(perPercentage);
			return perPercentage;
		} else {
			throw new Exception("Invalid Expression 3");
		}

	}

}
