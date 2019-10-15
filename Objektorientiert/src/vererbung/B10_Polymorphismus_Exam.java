package vererbung;

import java.util.Random;

/*
 * Polymorphismus (late binding) gibt es nur fur Instanzmethoden
 */

public class B10_Polymorphismus_Exam {
	
	static class Foo{
		
		static String note = "FA";

		//		static String getNote() {return note;}
		static String getNote() {return Foo.note;}
		
		static String getNoteNochmal() {return note;}
		
		
		
		public int getAtt() {
			return att;
		}




		int att = 12;
	} // end of Foo
	
	static class Bar extends Foo{
		
		static String note = "LA";
		
//		static String getNote() {return note;}
		static String getNote() {return Bar.note;}
		
		int att = 7; // nicht zu empfehlen (ein zweites Attribute mit demselben Namen)
		
		public int getAtt() {
			return att;
		}
	} //end Bar

	public static void main(String[] args) {
		
		System.out.println(Foo.note); // EA, early binding
		
		System.out.println(Bar.note); //LA, early binding
		
		System.out.println(Foo.getNote()); //FA, early binding
		System.out.println(Bar.getNote()); //LA, early binding
		
		System.out.println("5 " + Bar.getNoteNochmal()); //FA, early binding
		
		Foo var1 = null;
//		System.out.println(var1.toString()); // Kompiliert mit null pointer Exc
		
		System.out.println("6 " + var1.getNote()); // Achtung! Das Aufruf einer statische  Methode mit einer Referenz ist in Java kompilerbar. Es gibt eine Compilerwahrung. Dann ersetzt deer Compiler den Namen der Referenz durch ihren Typ.
		System.out.println("7 " + Foo.getNote()); // Gleich
		
		
		Foo foo = new Foo();
		System.out.println(foo.att);
		
		Bar foo2 = new Bar();
		System.out.println(foo2.att);
		
		foo = new Bar();
		System.out.println(foo.att); // 12
		
		System.out.println(((Bar)foo).att); // 7
		
		System.out.println(foo.getAtt());
		
		System.out.println("12 " + ((Bar)foo).getAtt()); //7 Late binding
		
		System.out.println("13 " + ((Foo)foo).getAtt()); //7 Late binding 
		
		foo = null;
		if (new Random().nextBoolean()) {
				foo= new Foo();
		} else {
			foo= new Bar();
		}
		
		System.out.println(foo.getAtt());
	}
	
}
