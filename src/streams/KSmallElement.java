package streams;

import java.util.List;
import java.util.stream.Collectors;

public class KSmallElement {
	
	public static void main(String[] args) {
		
		List<Integer> numList = List.of(1,2,3,4,5,6,7,8);
		Integer num = numList.stream().sorted().skip(4).limit(1).findFirst().orElse(-1);
		System.out.print(num);
		
	}

}
