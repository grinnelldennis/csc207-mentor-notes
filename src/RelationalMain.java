
import data_structures.LinkedList;
import inheritence_demo.Child;
import interface_demo.Flute;
import interface_demo.Instrument;
import interface_demo.Piano;
import objects.Company;

public class RelationalMain {

	public static void makeNoise(Instrument instrument) {
		instrument.makeNoise();
	}
	
	
	public static void main(String[] args) {
		
		// Parent pm = new Parent();
		Child poop = new Child();
		Child prabir = new Child();
		
		// System.out.println(pm.eyeColor);
		System.out.println(poop.eyeColor);
		

		// System.out.println(pm.hairiness);
		System.out.println(poop.hairiness);
		
		// pm.growHair();
		poop.growHair();
		
		// System.out.println(pm.hairiness);
		System.out.println(poop.hairiness);
		
		
		
		/* ---Interfaces--- 
		 * 
		 *	 
		 */
		
		Piano piano = new Piano();
		Flute flute = new Flute();
		
		makeNoise(piano);
		makeNoise(flute);
		
		
		
		/* ---Inheritance--- 
		 * 
		 * 
		 */
		
		Company grinnell = new Company("Grinnell", 9.5, 8.5);
		Company cornell = new Company(9.2, 8.5);
		Company shell = new Company();
		
		grinnell.getWages();
		cornell.getWages();
		
		Company.minimum_wage = 7.25;
		System.out.println(Company.minimum_wage); // 7.25 
		
		Company.minimum_wage = 8.1;
		System.out.println(grinnell.minimum_wage); 
		System.out.println(cornell.minimum_wage);
		
		
	}

}
