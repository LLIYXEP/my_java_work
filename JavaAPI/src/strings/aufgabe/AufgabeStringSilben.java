package strings.aufgabe;

import java.util.Arrays;
import java.util.Random;

public class AufgabeStringSilben {
	
	public static String[] SILBEN = {
			"pro","gi","idre","su","ola","as","im","si","og","bo","ka"
	}; 
	
	public static String[] createSilbenArray() {
//		return new String[]{
//				"pro","gi","idre","su","ola","as","im","si","og","bo","ka"
//		}; 
		return Arrays.copyOf(SILBEN, SILBEN.length);
	}
	
	public static String generiereName(String[] silben, int anzahlSilben) {
		Random random = new Random();
		
		String name = "";
		
		for (int i = 0; i < anzahlSilben; i++) {
			int index = random.nextInt(silben.length);
			name += silben[index];
		}
		
		String firstLetter = name.charAt(0) + "";
		name = firstLetter.toUpperCase() + name.substring(1);
		
		return name;
	}

	public static void main(String[] args) {
		
//		final String[] silben = {
//				"pro","gi","idre","su","ola","as","im","si","og","bo","ka"
//		}; 
		
//		SILBEN[1] = null;
//		
//		String[] arr = createSilbenArray();
//		arr[0] = null;
//		
//		System.out.println(Arrays.toString(SILBEN));
		
		String[] silben = createSilbenArray();
		for (int i = 0; i < 50; i++) {
			String name = generiereName(silben, 4);
			System.out.println(name);
		}
		
	} // end of main
	
}
