package streams;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAinList {

	public static void main(String[] args) {
		List<String> fruitsList = Arrays.asList("apple" , "banana" , "orange", "guava", "pomegranate");
		
		Map<String, Long> countA = fruitsList.stream().collect(Collectors.toMap(
				fruit -> fruit , 
				fruit -> fruit.chars().filter(ch -> ch == 'a').count()
				));
		
		countA.forEach((t, u) -> {
			
			System.out.println(t + "\t:" +  u);
		});
	}
}
