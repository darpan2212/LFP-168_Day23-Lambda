package com.bl;

public class Maths {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

		IMathFuncs add = Integer::sum;
		IMathFuncs multiply = (x, y) -> x * y;
		IMathFuncs sub = (x, y) -> x - y;
		IMathFuncs division = (x, y) -> x / y;
		IMathFuncs reminder = (x, y) -> x % y;

		IMathFuncs.printResult(14, 8, "Addition", add);
		IMathFuncs.printResult(14, 8, "Multiply", multiply);
		IMathFuncs.printResult(14, 8, "Substraction", sub);
		IMathFuncs.printResult(14, 8, "Division", division);
		IMathFuncs.printResult(14, 8, "Reminder", reminder);

	}

}