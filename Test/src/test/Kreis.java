package test;

interface Fahrbar {
	void motorAn();
	void motorAus();
	
	default void fahren() {
		motorAn();
		motorAus();
	}
}

class Oldtimer implements Fahrbar {
	public void motorAn() { /* ... */ }
	public void motorAus( { /* ... */ }
} 

public class Kreis{

	
	public static void main(String[] args) {
		

		TextFormat fmt = new HtmlTextFormat();
		fmt = new MarkdownTextFormat();
		System.out.println( fmt.fett("Freitag") );
		
	}

}
