package streams;

import java.util.stream.IntStream;

public class ReduceFunc {

	public static void main(String[] args) {
	
		System.out.println(IntStream.range(1, 10).reduce(0, (a,b) -> a+b));
		
	}
	
}
