package Lesson;

public class L44_StringBuilder {
	public static void main(String[] args) {
		
		String s = new String("abc");
		
		String s2 = s.concat("def");
		
		System.out.println(s);
		System.out.println(s2);
		
		StringBuilder stringBuilder = new StringBuilder("abc");
		stringBuilder.append("def");
		stringBuilder.insert(1, "-");
		System.out.println(stringBuilder);
		StringBuffer stringBuffer;
	}
	
	
}
