package inheritence_demo;

public class Person {
	public String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public void gettingOlderOrYounger(int age) {
		if (age > 100)
			System.out.println("nah bruh you lyin");
		else if (age < 0)
			System.out.println("(eyeroll) from rachel");
		else {
			this.age = age;
			showAge();
		}
	}
	
	public void recurseShowAge(int times) {
		if (times == 0)
			return;
		else {
			showAge();
			recurseShowAge(times - 1);
		}
	}
	
	private void showAge() {
		System.out.println("My age is " + age);
	}
}
