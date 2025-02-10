package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeToLists {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
		
		Stream.concat(list1.stream(), list2.stream()).distinct().sorted().collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

}
