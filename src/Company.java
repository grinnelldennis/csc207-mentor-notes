
public class Company {
	
	public String company_name;
	public static double minimum_wage;
	public double wage1;
	private double wage2;
	protected double wage3; 
	
	public static void doSomethingCorporate(){};
	
	public Company() {
		this("i'm tired", 7.25, 6.25);
	}
	
	public Company(double wage1, double wage2) {
		this("(this is a shell company)", wage1, wage2); 
	}
	
	public Company(String name, double wage1, double wage2) {
		this.company_name = name;
		this.wage1 = wage1;
	}
	
	public void getWages() {
		System.out.println("our " + company_name + " wages are " + wage1);
	}
}
