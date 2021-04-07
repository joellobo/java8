package rdev.playlistjava8lambdastreamseoptional;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Classe07 {

	public static void main(String[] args) {
//		IntStream
//		.range(0, 5)
//		.forEach(System.out::println);
//
//		IntStream
//			.range(0, 5)
//			.filter(n -> n % 2 == 0)
//			.forEach(System.out::println);

//		IntStream
//		.range(0, 5)
//		.filter((int n) -> n % 2 == 0)
//		.reduce((n1, n2) -> n1 + n2)
//		.ifPresent(System.out::println);

//		Runnable runnable = () -> System.out.print("Hi!");
//		
//		System.out.println(runnable);

		IntStream.range(0, 5)
			.filter(extracted()).forEach(n -> System.out.println(n));

	}

	private static IntPredicate extracted() {
		return n -> {
			System.out.println("Hi");
			return n % 2 == 0;
		};
	}

}
