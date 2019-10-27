package aufgabe.zahlen_laden;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;


public class Zahlen_laden {
	
	public static void main(String[] args) {
		
		String pathToFile = "D:\\Eclipse Projects\\Git\\my_java_work\\Aufgaben\\src\\aufgabe\\Datei.txt";
		
		ArrayList<Integer> zahlen = loadArrayFromFile(pathToFile);
		
		System.out.println(zahlen);
		
//		try(BufferedReader in = new BufferedReader(new FileReader(pathToFile))) {
//			
//			StringBuilder sb = new StringBuilder();
//			String line;
//			while( (line = in.readLine()) != null ) {
//				sb.append(line).append("\n");
//				
//			}
//			
//			System.out.println(sb);
//			
//		} catch (IOException e) {
//			throw new UncheckedIOException("Kann die Datei nicht lesen", e);
//		}	
		
	}
	
	static ArrayList loadArrayFromFile(String path) {
		ArrayList<String> newArr = new ArrayList<String>();
		
		try(BufferedReader in = new BufferedReader(new FileReader(path))) {
			
			String line;
			while( (line = in.readLine()) != null ) {
				newArr.add("\n" + line);
				
			}
			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Datei nicht lesen", e);
		}	
			
		return newArr;
	}

}
