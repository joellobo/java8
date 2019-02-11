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
	}
}
