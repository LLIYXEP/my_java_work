package strings;

import java.io.BufferedReader;
import java.io.FileReader;

public class LesenAusEinerTextdateilsNichtInDerPrufung {

	public static void main(String[] args) {
		/*
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
		*/
		
		String text =  loadFromFile("Datei mit Text.txt");
		System.out.println(text);
		
	} // End of main
	
	static String loadFromFile(String path) {
		
try(BufferedReader in = new BufferedReader(new FileReader(path))){
		
	StringBuilder sb = new StringBuilder();
			String line;
			
			while ((line = in.readLine()) != null) {
				sb.append(line).append("\n");
			}
			
			return sb.toString();
			
		} catch (Exception e) {
			System.out.println("Kann die Datei nicht lesen");
			e.printStackTrace();
		}
		
		return "";
	}
	
}
