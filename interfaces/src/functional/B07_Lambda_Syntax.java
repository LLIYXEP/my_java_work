package functional;

import java.util.ArrayList;

public class B07_Lambda_Syntax {
	
	interface FormatInt{
		String format(int x);
	}

	public static void main(String[] args) {
		
		/*
		 * 'notmale' Klasse
		 */
		class LocalFormat implements FormatInt{

			public String format(int x) {
				return "<" + x + ">";
			}
			
		} // End of LocalFormat
		
		FormatInt f1 = new LocalFormat();
		System.out.println("mit f1: " + f1.format(22));
		
		/*
		 * Lambda ausfurlich
		 */
		
		FormatInt f2 = (int x) -> {
			return "<" + x + ">";
			};
		System.out.println("mit f2: " + f2.format(22));
		
		/*
		 * Lambda. Parameterliste ohne Typ
		 */
		FormatInt f3 = (x) -> {
			return "<" + x + ">";
		};
		System.out.println("mit f3: " + f3.format(22));
		
		/*
		 * Lambda. Parameterliste ohne Klammer - nur wenn es genau einen Parameter gibt
		 */
		FormatInt f4 = x -> {
			return "<" + x + ">";
		};
		System.out.println("mit f4: " + f4.format(22));
		
		/*
		 * Lambda. Rumpf ohne gescw. Klammer - nur wenn der Rumpf aus einer einzigen Anwesung besteht
		 */
//		FormatInt f5 = x -> return "<" + x + ">"; // CF: return muss weg (semikolon auch)
		FormatInt f5 = x -> "<" + x + ">";
		System.out.println("mit f5: " + f5.format(22));
		
		userFormatter(f5);
		
//		userFormatter(x -> "<" + x + ">";); // CF : eine weitere (leere Anwesung) im Argument
		userFormatter(x -> "<" + x + ">");
		
		
	} // End of main
	
	static void userFormatter(FormatInt fmt) {
		System.out.println(fmt.format(22));
	}
	
}
