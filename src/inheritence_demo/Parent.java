package inheritence_demo;

public abstract class Parent {
	
	public String eyeColor = "white";
	public int hairiness = 1;
		
	public void growHair() {
		hairiness++;
	}
	
	public abstract void getSchoolYear();
	
}
