package inheritence_demo;

public abstract class Parent {
	
	final String eyeColor = "white";
	int hairiness = 1;
	
	public void growHair() {
		hairiness++;
	}
	
	public abstract void getSchoolYear();
	
}
