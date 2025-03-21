package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.List;

import live.learnjava.collections_framework.entities.Employee;

public class ArrayListUserDefinedObjectsExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Gopesh Sharma", "Hyd"));
		employees.add(new Employee(2, "Ramesh Kumar", "Del"));
		employees.add(new Employee(3, "Vinod Khanna", "Mumbai"));
		employees.add(new Employee(4, "Salman Khan", "Agra"));
		employees.stream().forEach(System.out::println); 
	}
}
