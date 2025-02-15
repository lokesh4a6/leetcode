package java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class usingFunctionalInterfaces {

	public static void main(String[] args) {
		
		Supplier<Number> ss = () ->  Math.random() * 10;
		
		System.out.println("supplier output :" + ss.get());
		
		
		Function<String, Integer> strlength = str -> str.length();
		
		System.out.println("Function output :" + strlength.apply("lokeshwar"));
		
		Consumer<String> conOutput = str -> System.out.println("Consumer output " + "Hello, " + str);
		
		conOutput.accept("world");
		
		Predicate<Integer> isEven = num -> num %2 == 0;
		
		System.out.println("Predicate output:" + isEven.test(11)) ;
		
	}
}
