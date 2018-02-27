import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import inheritence_demo.Food;
import inheritence_demo.GreenApple;
import inheritence_demo.Grinnell;
import objects.Company;
import objects.Counter;

/*
 * 	Main written during exam #1 mentor session for February 25. 
 */

public class Feb25Main {

	public static void main(String[] args) {

		/*
		 * Interacting with Grinnell.java & Company.java
		 */
		// Static fields can be used before the object is made
		Company.doSomethingCorporate();
		Company.minimum_wage = 7.5;
		 
		// co1.getWages();						<--- this doesn't work
		
		Company co1 = new Company();		
		Company co2 = new Company();
		
		co1.minimum_wage = 7.5;				
		System.out.println("Minimum Wage: college 1 $" +  co1.minimum_wage + " college 2 $" + co2.minimum_wage);

		co2.minimum_wage = 8.5;
		System.out.println("Minimum Wage: college 1 $" +  co1.minimum_wage + " college 2 $" + co2.minimum_wage);
		
		Company.minimum_wage = 9.1;
		System.out.println("Minimum Wage: college 1 $" +  co1.minimum_wage + " college 2 $" + co2.minimum_wage);
		
		co1.wage1 = 8.5;
		co2.wage1 = 8.7683456934857;
		System.out.println("\nWage 1: college 1 " +  co1.wage1 + " college 2 " + co2.wage1);
		
		co1.getWages();	
		co2.getWages();
		
		Grinnell grinnell = new Grinnell();
		grinnell.wage1 = 9.5;
		grinnell.company_name = "The best college, obviously.";
		
		
		// Things that do not work
		
		// System.out.println(grinnell.wage2);	
		
		// col1.wage2 = -2; 					<--- cannot access a private field
		// grinnell.wage2 = 8.5;				<--- cannot access a protected field
		// grinnell.wage3 = 9.9; 				<--- cannot access a protected field
	
		
		/*
		 *  Interacting with Counter.java
		 */
		Counter.count = 100;					
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		Counter.count++;
		c1.count++;
		c2.count++;
		
		System.out.println(c1.count);
		System.out.println(c2.count);
		System.out.println(Counter.count);
		

		Food apple = new GreenApple("lamie");
			
	}

}
