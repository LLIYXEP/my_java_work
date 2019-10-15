package sort_search;

import java.util.Arrays;

public class B01_StringSortieren {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "defg";
		
		int result = s1.compareTo(s2);
		
		if (result > 0) {
			System.out.println(s1 + " is grosser als " + s2);
		} else  if (result < 0){
			System.out.println(s1 + " is kleine als " + s2);
		} else {
			System.out.println(1212);
		}
		
		
		
		String[] array = {"abcd", "kkkk", "kk", "defg"};
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
	
}
