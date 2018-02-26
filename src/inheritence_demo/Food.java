package inheritence_demo;

public abstract class Food {
	
	public String name;
	
	public Food(String name) {
		this.name = name;
	}
	
	// concrete implementation
	public void getEaten(){
		System.out.println("noooooooo don't eat me");
	}
	
	public abstract void eatingInstructions();
	
}
