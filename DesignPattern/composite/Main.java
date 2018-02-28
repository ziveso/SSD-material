package composite;

public class Main {
	
	public static void main(String[] args) {
		Leaf a = new Leaf("A");
		Leaf b = new Leaf("B");
		Leaf c = new Leaf("C");
		Leaf d = new Leaf("D");
		
		Composite ab = new Composite();
		ab.add(a);
		ab.add(b);
		Composite abc = new Composite();
		abc.add(ab);
		abc.add(c);
		System.out.println(abc.getName());
		abc.add(d);
		
//		System.out.println(a.getName());
//		System.out.println(b.getName());
//		System.out.println(c.getName());
//		System.out.println(d.getName());
		
		
		
	}

}
