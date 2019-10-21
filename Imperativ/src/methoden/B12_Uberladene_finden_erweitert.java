package methoden;

interface Lauffaehig{}

class Auto{}
class Opel extends Auto implements Lauffaehig{}

public class B12_Uberladene_finden_erweitert {
	
	static void fahren(Auto param) {System.out.println("Auto");}
	static void fahren(Lauffaehig param) {System.out.println("Lauffaehig");}
	static void m(int x, long y) {System.out.println("int, long");}
	static void m(long x, int y) {System.out.println("long, int");}

	public static void main(String[] args) {
		
		Auto var1 = new Opel();
		fahren(var1);
		
		Lauffaehig var2 = null;
		fahren(var2);
		
		Opel var3 = null;
//		fahren(var3); // CF -- Zweideutig
		
		fahren((Auto)var3);
		fahren((Lauffaehig)var3);
		
		short s1 = 1;
		short s2 = 1;
//		m(s1, s2); // CF -- Zweideutig
		
//		m(2, 3); // CF -- Zweideutig
		
		m((int)s2, (long)s1);
		m((long)s1 ,s2);
	} // end of main
}
