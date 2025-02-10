package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> strings = Arrays
	            .asList("apple", "banana", "cherry", "date");
		
		Optional<String> optionalString = strings.stream().max(Comparator.comparingInt(String::length));
		
		System.out.println(optionalString.get());
		
		
	}
}
