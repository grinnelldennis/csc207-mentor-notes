
public class Test {

	public static void makeNoise(Instrument instrument) {
		instrument.makeNoise();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Child poop = new Child();
		Child prabir = new Child();
		
		System.out.println(pm.eyeColor);
		System.out.println(poop.eyeColor);
		

		System.out.println(pm.hairiness);
		System.out.println(poop.hairiness);
		
		pm.growHair();
		// poop.growHair();
		
		System.out.println(pm.hairiness);
		System.out.println(poop.hairiness);
		
		
		Piano piano = new Piano();
		Flute flute = new Flute();
		
		makeNoise(piano);
		makeNoise(flute);
		
		
		
		
		LinkedList list = new LinkedList();
		list.get(5);
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
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
