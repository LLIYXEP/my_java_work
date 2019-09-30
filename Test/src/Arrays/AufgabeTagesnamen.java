package Arrays;

class Test{
	
}

public class AufgabeTagesnamen {
	public static void main(String[] args) {
		//A1
		//Montag, Dienstag, Mittwoch, Donnerstag, Freitag
		
		//A2
		//Mo, Di, Mi, Do, Fr
		
		//A3
		//Samstag, Sonntag
		
		//A3
		//Sa, So
		System.out.println("----------------");
		
		String[] a1 = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag"};
		String[] a2 = {"Mo","Di","Mi","Do","Fr"};
		String[] a3 = {"Samstag","Sonntag"};
		String[] a4 = {"Sa","So"};
		
		String[][] speichern = new String[4][];
		
		speichern[0] = a1;
		speichern[1] = a2;
		speichern[2] = a3;
		speichern[3] = a4;
		
		for (String[] arrays : speichern) {
			for (String arr : arrays) {
				System.out.print(arr + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
	}
	
	static void test() {
		
	}// End of main
}
