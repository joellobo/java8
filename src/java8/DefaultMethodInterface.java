package java8;

public interface DefaultMethodInterface {
	
	default void print(String text) {
		System.out.println(text + ", default method");
	}
	
}