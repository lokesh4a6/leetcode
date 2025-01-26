package streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


 class Student{
	
	public String name;
	public int rollNo;
	public int marks;
	public int age;
	
	
	public Student(String name, int rollNo, int marks, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", age=" + age + "]";
	}

	
}
public class sortStudents {

	public static void main (String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Lokesh", 1, 95, 30));
		studentList.add(new Student("Shyam", 2, 90, 20));
		studentList.add(new Student("kumar", 3, 80, 34));
		studentList.add(new Student("raj", 4, 82, 34));
		
		List<Student> sortedStudentList = studentList.stream().sorted(Comparator.comparing(Student::getName, Comparator.reverseOrder()).thenComparing(Student::getAge)).collect(Collectors.toList());
		
		sortedStudentList.forEach(System.out::println);
		
	}
	
}
