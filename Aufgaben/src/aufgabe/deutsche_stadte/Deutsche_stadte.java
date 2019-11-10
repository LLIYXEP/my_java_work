package aufgabe.deutsche_stadte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Deutsche_stadte {

	public static void main(String[] args) throws IOException {
		
		java.net.URL url = new java.net.URL("https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland");   
		InputStream is = url.openStream();   
		Reader r = new InputStreamReader(is);   
		try(BufferedReader in = new BufferedReader( r )) {
			
			StringBuilder sb = new StringBuilder();
			String line;
			while( (line = in.readLine()) != null ) {
				sb.append(line).append("\n");
			}
			
			Document doc = Jsoup.parse(sb.toString());
			
			Elements elementTable = doc.getElementsByClass("mw-datatable");
			
//			System.out.println(elementTable.size());
			Elements elements = elementTable.get(0).getElementsByTag("td");
			
			List<Stadt> stadte = new ArrayList<Stadt>();
			
			
//			for (int i = 0; i < elements.size(); i++) {
//				
//				stadte.add(new Stadt(elements.get(1).toString(), elements.get(12).toString(), elements.get(17).toString()));
//			}
			
			System.out.println(elements);

			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
		}
		
	}
	
}
