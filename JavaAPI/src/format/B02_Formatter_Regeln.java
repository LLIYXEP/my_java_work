package format;

public class B02_Formatter_Regeln {
	
	/* Format String allgemein
	 * 
	 * 		%[argument_index$][flags][width][.precision]conversion
	 * 		%[аргумент_индекс][флаги][ширина][.точность]символ_преобразования
	 * 
	 */
	
	public static void main(String[] args) {
//		conversion();
//		argumentsIndex();
//		precision();
//		width();
		flags();
		
	}// end of main
	
	/*
	 * %[flags]conversion
	 */
	static void flags() {
		System.out.println("*****************************");
		System.out.println("%[flags]conversion");
		System.out.println("*****************************");
		
		System.out.println("----------------------- 1");
		System.out.format("| %6s | %n" ,"Tom");
		System.out.format("| %6s | %n" ,"Jerry");
		System.out.println("----------------------- 2 LInksbundig mit dem flag '-'");
		System.out.format("| %-6s | %n" ,"Tom");
		System.out.format("| %-6s | %n" ,"Jerry");
		
		System.out.println("----------------------- 3");
		System.out.format("|%10.2f| %n", 123.456);		// |    123,46|
		System.out.format("|%-10.2f| %n", 123.456);		// |123,46    | 
		System.out.format("|%10d| %n", 99307);    		// |     99307| 
		System.out.format("|%010d| %n", 99307);    		// |0000099307|  // 0-Flag nur fur Zahlen

	}
	
	/*
	 * %[width]conversion
	 */
	static void width() {
		System.out.println("*****************************");
		System.out.println("%[width]conversion");
		System.out.println("*****************************");
		
		System.out.format("<%s> %n", "Tom");
		System.out.format("<%5s> %n", "Tom");
		
		System.out.println("-----------------------");
		System.out.format("| %s | %n" ,"Tom");
		System.out.format("| %s | %n" ,"Jerry");
		System.out.println("-----------------------");
		System.out.format("| %6s | %n" ,"Tom");
		System.out.format("| %6s | %n" ,"Jerry");
		System.out.println("-----------------------");
		System.out.format("| %10s | %n" ,"Tom");
		System.out.format("| %10s | %n" ,"Mustermann");
		System.out.println("-----------------------");
		
	}
	
	/*
	 * %[.precision]f
	 */
	static void precision() {
		System.out.println("*****************************");
		System.out.println("%[.precision]f");
		System.out.println("*****************************");
		
		System.out.format("<%f> %n", 12.0);			// <12,000000> 
		System.out.format("<%f> %n", 12.123456789); // <12,123457>
		
		System.out.format("<%.2f> %n", 12.0);			// <12,00> 
		System.out.format("<%.2f> %n", 12.123456789);   // <12,12>
		System.out.format("<%.2f> %n", 8.567);   	    // <8,57> 
		System.out.format("<%.2f> %n", 8.999);   	    // <9,00>
		
	}
	
	/*
	 * %[argument_index$]conversion
	 */
	static void argumentsIndex() {
		System.out.println("*****************************");
		System.out.println("%[argument_index$]conversion");
		System.out.println("*****************************");
		
		System.out.format("1: %s %s %s %n", "mo", "di", "mi");		// 1: mo di mi 
		System.out.format("2: %2$s %s %n", "mo", "DI");				// 2: DI mo 
		System.out.format("3: %2$s %s %s %n", "mo", "DI");			// 3: DI mo DI 
		System.out.format("4: %2$s %s %2$s %s %2$s %n", "mo", "DI");			// 4: DI mo DI DI DI  Neobhodimi 2 argumenta i u nas esti 2.
	}

	/*
	 *  conversion
	 */
	public static void conversion() {
		
		System.out.format("Ausgabe 1\n");
		
		/*
		 *  %n - line separator
		 */
		System.out.format("Ausgabe 2 %nAusgabe 3 %n");
		
		/*
		 *  %s - Argument als text
		 */
		System.out.println("****** %s - Argument als Text");
//		System.out.format("%s %n"); // Exc kein Argument
		System.out.format("%s %n", "Hello world");
		System.out.format("%s %n", 12);
		System.out.format("%s %n", false);
		
		System.out.format("%s %s %n", "Hello", "Andrei");
		
		/*
		 * %d - Argument als eine ganze Zahl
		 */
		System.out.println("****** %d - Argument als eine ganze Zahl");
//		System.out.format("%d", "22"); // Exc - Argument ist keine ganze Zahl
		System.out.format("<<<%d>>>%n", 22);
		System.out.format("<<<%d>>>%n", 12345678901L);
		
		/*
		 * %f - Argument als eine Gleitkomma- Zahl
		 */
		System.out.println("****** %f - Argument als eine Gleitkomma- Zahl");
//		System.out.format("<<<%f>>>", 22); // Exc - Argument ist keine Gleitkomma- Zahl
		System.out.format("<<<%f>>>%n", 22.0); 
		System.out.format("<<<%f>>>%n", 123.456); 
		System.out.format("<<<%f>>>%n", 4F); 
	}
	
}
