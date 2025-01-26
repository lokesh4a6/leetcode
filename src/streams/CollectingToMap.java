package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectingToMap {

	public static void main(String[] args) {
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Lokesh", 1, 95, 30));
		studentList.add(new Student("Shyam", 2, 90, 20));
		studentList.add(new Student("kumar", 3, 80, 34));
		studentList.add(new Student("raj", 4, 82, 34));
		
		Map<String, Integer> mapedStudentList = studentList.stream().collect(Collectors.toMap(a -> a.getName(), a ->a.getAge()));
		mapedStudentList.forEach((t, u) -> {
			System.out.println("name: " + t + "\t" + " age: " + u);
		});
		
	}
	
}
