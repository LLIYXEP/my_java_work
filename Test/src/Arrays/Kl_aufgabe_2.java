package Arrays;

class Tier{
	
	static {
		System.out.println("Tier / static");
	}
	
	Tier(){
		System.out.println("Tier /Konstructor");
	}
	
}

class Stern{
	static {
		System.out.println("Stern / static init");
	}
}

public class Kl_aufgabe_2 {
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("main 1");
		Tier t1;
		
		System.out.println("main 2");
		new Tier();
		
		System.out.println("main 3");
		new Tier();
		
		
		Class<?> classofStern =  Class.forName("Arrays.Stern");
//		Class<?> classofStern = Stern.class;
		
		Class<?> classofTier = Tier.class;
		
		Class<?> classSternCopy = Stern.class;
		
		System.out.println("Refvergl: " + (classofStern == classSternCopy));
		
		Stern s1 = new Stern();
		
		Class<?> classSternCopy2 = s1.getClass();
		
		System.out.println("Refvergl: " + (classofStern == classSternCopy2));
		
		System.out.println("Klassenname (voll): " + classofStern.getName());
		System.out.println("Klassenname (einfach): " + classofStern.getSimpleName());
	}
	
	static {
		System.out.println("Kl_aufgabe_2 " +1212);
	}
}
