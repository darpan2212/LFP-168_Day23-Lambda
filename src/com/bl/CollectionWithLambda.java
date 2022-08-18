package com.bl;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class MyConsumer<T> implements Consumer<T> {
	@Override
	public void accept(T t) {
		System.out.println("Mth3 : " + t);
	}
}

public class CollectionWithLambda {

	public static void main(String[] args) {

		doListDemo();
		doIntListDemo();

	}

	private static void doListDemo() {

		System.out.println("____________In doListDemo______________");

		List<String> list = new LinkedList<>();

		list.add("Jack");
		list.add("Mack");
		list.add("Jeff");
		list.add("Elon");

		System.out.println("--------Lambda method------------");
		list.forEach((personName) -> {
			System.out.println("Mth1 : " + personName);
		});

		System.out.println("----------println method------------------");

		list.forEach(System.out::println);

		System.out.println("--------Consumer Obj-----------------");

		Consumer<String> consumer = (str) -> {
			System.out.println("Mth2 : " + str);
		};
		list.forEach(consumer);

		System.out.println("--------MyConsumer Obj-----------------");
		MyConsumer<String> myConsumer = new MyConsumer<>();
		list.forEach(myConsumer);

	}

	private static void doIntListDemo() {

		System.out.println("____________In doIntListDemo______________");

		List<Integer> intList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * 100);
			intList.add(random);
		}

		Function<Integer, Double> doubleValue = Integer::doubleValue;

		Predicate<Integer> predict = n -> n % 2 == 0;
		
		intList.forEach((n) -> {
			if (predict.test(n))
				System.out.println(doubleValue.apply(n));
		});
	}

}