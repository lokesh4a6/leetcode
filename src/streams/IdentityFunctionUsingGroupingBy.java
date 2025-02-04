package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdentityFunctionUsingGroupingBy {

	public static void main(String[] args) {
		
		List<String> fruitList =  Arrays.asList("orange", "grapes ", "apple", "orange", "apple", "banana" );
		Map<String, Long> countFruits = fruitList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));
		countFruits.forEach((a, b) -> System.out.println(a + "   -> " + b));
		
		
	}
}
