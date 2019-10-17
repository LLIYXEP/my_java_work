package strings.aufgabe;

public class KlAufgabe {

	public static void main(String[] args) {

		String s = "Die Note Do ist nicht dasselbe wie Do, wenn Do fur Donnerstag steht";
		findInString(s,"Do");
		System.out.println();
		findInString2(s,"Do");
		System.out.println();
		findInString3(s,"Do");
	}
	
	static void findInString3(String string,String find) {
		for (int i = 0; i < string.length() - find.length(); i++) {
			if (string.indexOf(find, i) > 0) {
				i = string.indexOf(find, i);
				System.out.println("Treffer, Index: " + i);
			}
		}
	}
	
	static void findInString2(String string,String find) {
		for (int i = 0; i < string.length() - find.length(); i++) {
			if (string.startsWith(find, i)) {
				System.out.println("Treffer, Index: " + i);
			}
		}
	}
	
	static void findInString(String string,String find) {
		
		int index = string.lastIndexOf(find, string.length());
		System.out.println("Index of " + find + " " + index);
		
		for (int i = string.length(); i > 0; i--) {
			index = string.lastIndexOf("Do", index -1);
			if (index > 0) {
				System.out.println("Index of " + find + " " + index);
			} else return;
		}
		
	}
	
}
