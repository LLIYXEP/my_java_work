package strings;

public class B05_Konkatenieren {

	public static void main(String[] args) {
		
		String s = "";
		
		for (int i = 0; i < 1000; i++) {
			s = s + 1;
		}
		
		System.out.println(s.length());
	}
	
}
