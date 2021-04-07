package rdev.playlistjava8lambdastreamseoptional;

import java.util.Arrays;
import java.util.List;

public class Classe08 {

	public static void main(String[] args) {
		// com method reference
//		List<Integer> list = Arrays.asList(1,2,3,4);
//		list.stream().forEach(System.out::println);
		
		// sem method reference
//		List<Integer> list = Arrays.asList(1,2,3,4);
//		list.stream().forEach(n -> System.out.println(n));
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		list
			.stream()
			.map(Classe08::multipliquePorDois)
			.forEach(System.out::println);
	}
	
	private static Integer multipliquePorDois(Integer i) {
		return i * 2;
	}

}
