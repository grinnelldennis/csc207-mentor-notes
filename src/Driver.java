
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList als = new ArrayList();

		als.add(0);
		als.add(1);
		als.add(2);
		als.add(3);
		System.out.println(als.toString());
		als.add(4);
		als.add(5);
		als.add(6);
		als.add(7);
		System.out.println(als.size());
		als.add(8);
		als.add(9);
		als.add(10);
		als.add(11);
		System.out.println(als.toString());
		als.add(12);
		als.add(13);
		als.add(14);
		als.add(15);
		System.out.println(als.toString());
		als.remove(0);
		als.remove(0);
		als.remove(0);
		als.remove(0);
		System.out.println(als.toString());
		als.remove(4);
		System.out.println(als.toString());
		System.out.println(als.contains(15));
		als.add(0);
		System.out.println(als.toString());
		
	}

}
