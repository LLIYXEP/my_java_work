package vererbung;

class TextFormat{
	String text;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public String toString() {
		return "Formatter for: " + text;
	}
	
}

class HtmlTextFormat extends TextFormat{

	public HtmlTextFormat(String text) {
		this.text = text;
	}
	
	public String fett() {
		return "<b>" + text + "</b>";
	}
	
	public String kursiv() {
		return "<i>" + text + "</i>";
	}
	
	@Override
	public String toString() {
		return "Html" + super.toString();
	}
	
}

class MarkdownTextFormat extends TextFormat{

	public MarkdownTextFormat(String text) {
		this.text = text;
	}
	
	public String fett() {
		return "__" + text + "__";
	}

	@Override
	public String toString() {
		return "Markdown" + super.toString();
	}
	
}

public class B02_nochmal_extends {

	public static void main(String[] args) {
		String text = "Heute ist Dienstag";
		HtmlTextFormat htmlTextFormat = new HtmlTextFormat(text);
		
		String htmlTextFett = htmlTextFormat.fett();
		
		System.out.println("fett html: " + htmlTextFett);
		
		MarkdownTextFormat markdownTextFormat = new MarkdownTextFormat(text);
		
		String mdTextFett = markdownTextFormat.fett();
		
		System.out.println("fett md: " + mdTextFett);
		
		//Elemente der Basisklasse mit Objekten der abgeleiteten Typen;
		
		System.out.println();
		
		System.out.println("mdFormat.text: " + markdownTextFormat.text);
		markdownTextFormat.setText("Freitag");
		String newText = markdownTextFormat.getText();
		System.out.println("mdFormat.text: " + markdownTextFormat.text);
		
		System.out.println();
		
		System.out.println("htmlTextFormat.text: " + htmlTextFormat.text);
		htmlTextFormat.setText("Moin");
		String newText2 = htmlTextFormat.getText();
		System.out.println("htmlTextFormat.text: " + htmlTextFormat.text);
		
		//ToString Test
		
		System.out.println("*********toString Test**********");
		
		System.out.println(htmlTextFormat);
		System.out.println(markdownTextFormat);
		
		
	}
	
}
