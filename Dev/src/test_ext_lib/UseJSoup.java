package test_ext_lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UseJSoup {

	public static void main(String[] args) {
		
		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p>Nr. 1</p><p>Nr. 2</p></body></html>";
				Document doc = Jsoup.parse(html);
				
				System.out.println(doc);
				
//				<html>
//				 <head>
//				  <title>First parse</title>
//				 </head>
//				 <body>
//				  <p>Nr. 1</p>
//				 </body>
//				</html>
				
				Elements ellePTags =  doc.getElementsByTag("p");
				System.out.println(ellePTags);
				
				System.out.println();
				for (int i = 0; i < ellePTags.size(); i++) {
					 Element pTag = ellePTags.get(i);
					 System.out.println(i + ": " + pTag.ownText());
					 
					
				}
		
	}
	
}
