package streams;

import java.util.*;
import java.util.stream.Collectors;

class Department{
	private Integer id;
	private String name;
	
	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}

class Employee{
	
	private Integer id;
	private List<Department> departments;
	private String name;
	public Employee(Integer id, List<Department> departments, String name) {
		super();
		this.id = id;
		this.departments = departments;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departments, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(departments, other.departments) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", departments=" + departments + ", name=" + name + "]";
	}
	
	
}
public class SortEmployeeByDept {

	public static void main(String[] args) {
		Department dept1 = new Department(1, "dept1");
		Department dept2 = new Department(1, "dept2");
		Department dept3 = new Department(1, "dept3");
		Department dept4 = new Department(1, "dept4");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, List.of(dept1, dept2), "Emp1"));
		employeeList.add(new Employee(2, List.of(dept4, dept2), "Emp2"));
		employeeList.add(new Employee(3, List.of(dept1, dept3), "Emp3"));
		employeeList.add(new Employee(4, List.of(dept1, dept4), "Emp4"));
		
		List<Employee> filteredList = employeeList.stream().filter(e -> e.getDepartments()
				.contains(dept4)).collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}
	
}
