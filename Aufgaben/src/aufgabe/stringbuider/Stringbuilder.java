package aufgabe.stringbuider;

public class Stringbuilder {

	public static void main(String[] args) {
		
		String s1 = "Hello";
        String s2 = " ";
        String s3 = "Welt";
        
        String gesamt = new String();
        
        long start = System.currentTimeMillis();
        
        long timeConsumedMillis = 0;
        
        for (int i = 0; i < 3000; i++) {
        	gesamt += s1 + s2 + s3 + ", ";
        	long finish = System.currentTimeMillis();
        	timeConsumedMillis = finish - start;
		}

        System.out.println(gesamt);
        System.out.println(timeConsumedMillis);
        
        StringBuilder gesam2 = new StringBuilder();
        System.out.println(gesam2);
        
        long start2 = System.currentTimeMillis();
        
        long timeConsumedMillis2 = 0;
        
        for (int i = 0; i < 3000; i++) {
        	gesam2.append(s1 + s2 + s3 + ", ");
        	long finish2 = System.currentTimeMillis();
        	timeConsumedMillis2 = finish2 - start2;
		}

        System.out.println(gesam2);
        System.out.println(timeConsumedMillis2);
	}
	
}
