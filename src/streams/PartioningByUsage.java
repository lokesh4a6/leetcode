package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartioningByUsage {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Lokesh", 1, 95, 30));
		studentList.add(new Student("Shyam", 2, 90, 20));
		studentList.add(new Student("kumar", 3, 80, 34));
		studentList.add(new Student("raj", 4, 82, 34));
		
		Map<Boolean, List<Student>> numbers = studentList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        String textBlock = """
                students age > 30 
      --------------------------------
                """;        
		System.out.println(textBlock);
		
		numbers.get(true).forEach(System.out::println);
        String textBlock1 = """
                students age > 30 
      --------------------------------
                """;
        
		System.out.println(textBlock1);
		numbers.get(false).forEach(System.out::println);
	}
	
}
