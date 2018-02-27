/**	CSC-207 Static Stuff
 * 
 * @author Dennis Chan
 * 
 * 		Rule for calling contexts
 * 
 * 		caller			callee
 *		non-static --->	static 
 *						non-static
 * 		static ------->	static
 *
 */

package static_demo;

public class StaticMain {
	
	public static int staticVariable;
	public int nonStaticVariable;
	
	
	public void nonStaticMethod() { 
		// you cannot call this from main/a static context
	}
	

	public static void staticMethod() {
		// you can call this from a static and non-static context
		// you cannot, again, call non-static methods like below
		// nonStaticMethod();
	}
	
	public static void main(String[] args) {
		// main is always static
		
		// function calls
		staticMethod(); 		//  this works
		// nonStaticMethod()	 	this doesn't work;
		
		// variable calls
		staticVariable++;		// this works
		// nonStaticVariable++;	   this doesn't work

		Object.staticVariableInObject = 0;
		Object demo = new Object();
		demo.nonStaticVariableInObject = 0;
		
		
	}

}
