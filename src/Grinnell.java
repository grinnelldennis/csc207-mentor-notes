// When a class extends another class, the class
//  extending "inherits" the fields and behavior of
//  the parent class. The inheritence is done by 
//  the keyword "extends"

public class Grinnell extends Company{
	
	public void unionize() {
		// wage1 marked public --> access ok
		wage1 = 8.5;
		// wage2 marked private --> oooops
		// wage2 = 9.1;
		// wage3 marked protected --> access also ok
		wage3 = 9.5;
		
	}
	
	
	
}
