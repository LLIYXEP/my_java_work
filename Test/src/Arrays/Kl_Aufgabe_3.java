package Arrays;

class Zebra{
	private String name;
	
	Zebra(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name;
	}
}



public class Kl_Aufgabe_3 {
	public static void main(String[] args) {
		
		Zebra z1 = new Zebra("Rosie");
		
		System.out.println(z1);
		
//		Classs<?> c1 = z1;
		
		System.out.println(z1.getClass());
		
		Class<?> c1 = Zebra.class;
		
		System.out.println(c1.getName());
		
	}
}
