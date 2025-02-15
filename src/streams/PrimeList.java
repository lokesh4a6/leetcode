package streams;

import java.util.Arrays;
import java.util.List;

public class PrimeList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15, 1, 0);
		numbers.stream().filter(PrimeList::isPrime).forEach(System.out::println);
		
	}
	
	public static boolean isPrime(Integer i) {
		if(i == 0 || i == 1 ) {
			return true;
			
		} 
		
		for(int j = 2 ; j <= Math.sqrt(i) ; j++) {
			
			if(i % j == 0) {
				return false;
			}
		}
		
		return true;
	}
}
