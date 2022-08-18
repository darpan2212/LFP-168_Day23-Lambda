package com.bl;

@FunctionalInterface
public interface IMathFuncs {

	int calculate(int num1, int num2);

	public static void printResult(int num1, int num2, String function,
			IMathFuncs mathFunc) {
		System.out.println("Result of " + function + " between " + num1 + " and " + num2
				+ " is :" + mathFunc.calculate(num1, num2));
	}

}