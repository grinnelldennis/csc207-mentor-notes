import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import inheritence_demo.Food;
import inheritence_demo.GreenApple;
import inheritence_demo.Grinnell;
import objects.Company;
import objects.Counter;

public class Main2 {

	
	public void nonStaticMethod() {
		// you cannot call this from main/a static context
	}
	
	public static void staticMethod() {
		// you can call this from a static and non-static context
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// None static methods will not run
		// nonStaticMethod();
		staticMethod();
		
		Company.doSomethingCorporate();
		Company.minimum_wage = 7.5;
		
		// dont try this, it doesn't work -> 
		// co1.getWages();
		
		// Multiple Companies
		Company co1 = new Company();
		Company co2 = new Company();
		
		co1.minimum_wage = 7.5;
		System.out.println(co1.minimum_wage);
		System.out.println(co2.minimum_wage);

		co2.minimum_wage = 8.5;
		System.out.println(co1.minimum_wage);
		System.out.println(co2.minimum_wage);
		
		Company.minimum_wage = 9.1;
		System.out.println(Company.minimum_wage);
		System.out.println(Company.minimum_wage);
		
		co1.wage1 = 8.5;
		co2.wage1 = 8.7683456934857;
		System.out.println(co1.wage1);
		System.out.println(co2.wage1);
		
		co1.getWages();	
		co2.getWages();
		
		// this is a variable marked private, therefore 
		//   you cannot access it from main.  
		// col1.wage2 = -2; 
		
		// Interacting with Counter.java
		Counter.count = 100;
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		Counter.count++;
		c1.count++;
		c2.count++;
		
		System.out.println(c1.count);
		System.out.println(c2.count);
		System.out.println(Counter.count);
		
		
		// Inheritance and protected fields
		Grinnell grinnell = new Grinnell();
		grinnell.wage1 = 9.5;
		grinnell.company_name = "The best college, obviously.";
		
		// System.out.println(grinnell.wage2);
		
		// wage2 and wage3 shouldn't work
		// grinnell.wage3 = 9.9;
		// grinnell.wage2 = 8.5;
		
		LinkedList list1 = new LinkedList();
		
		// let say list 2 has 2 spots 
		ArrayList list2 = new ArrayList();
		
		
		list1.add(1);
		list2.add(1);
		
		List<String> list3 = new ArrayList<>();
		LinkedList<Color> list4 = new LinkedList<>();
		
		// #throwback
		Food apple = new GreenApple("jamie");
		if (apple.instanceof(GreenApple)) 
			
		
	}

}
