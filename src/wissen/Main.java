package wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		Employee e1 = new Employee("Akash", 1);
//		Employee e2 = new Employee("Akash", 1);		
//		Employee e3 = new Employee("Pratidhi", 1);
//
//		ArrayList<Employee> list = new ArrayList<Employee>();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		
//		Comparator<Employee> comp = new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2)
//			{				
//				return (e1.getName().compareTo(e2.getName()));
//			}
//			
//		};
//		list.sort(comp);
//		
////		list.sort(Comparator.comparing(e -> e.getName()));
//		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	    int sum = numbers.stream()
	        .filter(n -> n % 2  == 1)
	        .map(n  -> n * n)
	        .reduce(0, Integer::sum);

//	    System.out.println(sum);
		Parent p = new Child();
		p.run();
	}
}
