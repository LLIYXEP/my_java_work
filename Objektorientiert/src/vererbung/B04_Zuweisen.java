package vererbung;

class Pflanze{
	int alter;
}

class Blume extends Pflanze{
	
}

public class B04_Zuweisen {
	public static void main(String[] args) {
		
		Object var1 = new Object();
		Object var2 = var1;
		Object var3 = new Pflanze();
		Object var4 = new Blume();
		Blume b = new Blume();
//		Blume var5 = new Pflanze();
//		Blume var5 = var4;
//		Pflanze var5 = var4;
		var3 = var4;
		Pflanze p = new Blume();
		
//		var4 = new String("");
//		p = new String("");
		
		b.alter = 12;
	}
}
