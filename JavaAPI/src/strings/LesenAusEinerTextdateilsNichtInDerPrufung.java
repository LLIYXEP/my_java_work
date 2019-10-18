package strings;

import java.io.BufferedReader;
import java.io.FileReader;

public class LesenAusEinerTextdateilsNichtInDerPrufung {

	public static void main(String[] args) {
		
		String relativePath = "Datei mit Text.txt";
		
		
		try(BufferedReader in = new BufferedReader(new FileReader(relativePath))){
			
			String line;
			
			while ((line = in.readLine()) != null) {
				System.out.println("Zeile: " + line);
			}
			
		} catch (Exception e) {
			System.out.println("Kann die Datei nicht lesen");
			e.printStackTrace();
		}
		
		
		
	}
	
}
