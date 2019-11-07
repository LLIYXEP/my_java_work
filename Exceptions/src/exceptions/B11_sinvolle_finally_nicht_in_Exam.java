package exceptions;

import java.io.IOException;
import java.io.PrintWriter;



/*
 * Resouce-klassen sind nicht in der OCA-Prufung
 * 
 * Verwenden Sie in der Praxis (wenn es geht) 'try-with-resources' stat try/finally
 * 
 * try-with-resources ist nicht in der OCA-Prufung
 */

public class B11_sinvolle_finally_nicht_in_Exam {

	public static void main(String[] args) {
		
		/*
		 * Eine textdatei offnen, in die Datei schreiben, dann die Datei schliessen: 
		 * das alles geht uber PrintWriter ( auch als 'Ressource' bezeichnet)
		 */
		
		String pfadZuDerDatei = "autos.txt"; // relative Pfadangaben
		PrintWriter out1 = null;
		try {
			out1 = new PrintWriter(pfadZuDerDatei); // checked Exc deklariert
			
			out1.println("VW");
			out1.println("OPEL");
			out1.println("KIA");
			
			
			System.out.println("Datei erzeigt/uberschreiben: " + pfadZuDerDatei);
			
		} catch (IOException e) {
			System.out.println("Fehler beim Erzeugen der Datei!");
			e.printStackTrace();
		} finally {
			
			if (out1 != null) {
				out1.close();
			}
		}

		
		/*
		 * try-with-resources
		 */
		try(PrintWriter out = new PrintWriter("tiere.txt")) {
			out.println("Hund");
			out.println("Katze");
		} catch (Exception e) {
			e.printStackTrace();
		} // implizit wird die Resource out geschlossen! Kein finally mit out.close() notig
		
		
		
	} // end of main
	
}
