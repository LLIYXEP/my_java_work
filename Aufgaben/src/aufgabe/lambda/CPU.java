package aufgabe.lambda;

import java.util.ArrayList;
import java.util.List;

public class CPU {

	private int anzahlKerne;
	private String hersteller;
	
	public CPU(int anzahlKerne, String hersteller) {
		super();
		this.anzahlKerne = anzahlKerne;
		this.hersteller = hersteller;
	}
	
	


	@Override
	public String toString() {
		return hersteller;
	}




	public static void main(String[] args) {
		
		List<CPU> list = new ArrayList<>();
		list.add(new CPU(4, "Firma 1"));
		list.add(new CPU(6, "Firma 2"));
		list.add(new CPU(8, "Firma 3"));
		list.add(new CPU(10, "Firma 4"));
		
		
		list.forEach(cpu -> System.out.println(cpu.hersteller));
		
		//Consumer mit einer Methode-Referenz (nicht in der Prufung)
		
		list.forEach(System.out::println); // 2 Variant
	}
	
}
