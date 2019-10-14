package vererbung;

import java.util.Arrays;

class Wochentsg{
	String name;
	Wochentsg(String name){
		this.name = name;
	}	
	
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return name;
	}
}


class WdhArrays {
	
	

	public static void main(String[] args) {
		
		String [] days = createDaysArray();
		System.out.println(Arrays.toString(days));
		
		Wochentsg t1 = new Wochentsg( days[0]);
		System.out.println(t1);
		
		Wochentsg[] wArray = convertieren(days);
		System.out.println(Arrays.toString(wArray));
		
	}
	
	static Wochentsg[] convertieren(String[] arr) {
		Wochentsg[] warr = new Wochentsg[arr.length];
		for (int i = 0; i < warr.length; i++) {
			warr[i] = new Wochentsg(arr[i]);
		}
		return warr;
	}
	
	static String[] createDaysArray() {
		return new String[]{"mo", "di", "mi", "do", "fr", "sa", "so"};
	}
	
}
