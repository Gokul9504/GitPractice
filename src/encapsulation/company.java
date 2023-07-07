package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class company {

	public static void main(String[] args) {
		
	List<Employee> l = new ArrayList();
	
	Employee e = new Employee();
	
	e.setId(12321);
	e.setName("Gokul");
	e.setPhno(9092913309l);
	
	l.add(e);
	
	for (int i = 0; i < l.size(); i++) {
		
		System.out.println(l.get(i).getId());
		System.out.println(l.get(i).getName());
		System.out.println(l.get(i).getPhno());
		}
	}
}