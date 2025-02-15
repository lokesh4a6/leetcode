package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
	
		int[] intArray = {1,2,2,3,10,2,3,4,5,6,5,7,7,8,8};
		
		Integer small = Arrays.stream(intArray).distinct().boxed().sorted((a , b) -> b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(small);
	}
}
