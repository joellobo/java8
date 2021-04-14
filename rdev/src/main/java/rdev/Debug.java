package rdev;

import java.util.Arrays;
import java.util.List;

public class Debug {

	public static void main(String[] args) {
//		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
//		asList.stream()
//			.map((n) -> new StringBuilder().append(n).append("s").append("a") )
//			.forEach(System.out::println);
		
		
//		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
//		asList.stream()
//			.map(
//					(n) -> {
//						StringBuilder append = new StringBuilder();
//						append.append(n);
//						append.append("s");
//						append.append("a");
//						return append;
//					}
//				)
//			.forEach(System.out::println);
		
		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		asList.stream()
			.peek(n -> System.out.println(n))
			.map((n) -> new StringBuilder().append(n).append("s").append("a") )
			.forEach(System.out::println);		
		
		
	}

}
