package format;

import java.text.DecimalFormat;

public class TestRunden {

	public static void main(String[] args) {
		
		double var1 = 12.5567;
		
		System.out.println(Math.round(var1 * 100) / 100.);
		
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.println(format.format(var1));
		
	}
	
}
