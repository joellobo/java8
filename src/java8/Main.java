package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Sorting collections
		List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");

		Comparator<String> comparador = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};

		palavras.sort(comparador);
		System.out.println(palavras);
		
		// Default method
		DefaultMethod dm = new DefaultMethod();
		dm.print("Hello");
		
		// Lambda
		// functional interface See java.util.function
		
		Comparator<String> comparador2 = (s1, s2) -> {
	        return Integer.compare(s1.length(), s2.length());
		};
		
		Comparator<String> comparador3 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));

	}
}
