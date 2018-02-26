package inheritence_demo;
public class Lasagna extends Food{

	int layers;
	
	public Lasagna() {
		this("i'm sad and have no name", 5);
	}
	
	public Lasagna(String name, int layers) {
		super(name);
		this.layers = layers;
	}
	
	
	public void eatingInstructions() {
		/// provide eating instructions
		super.getEaten();
	}
	
}
