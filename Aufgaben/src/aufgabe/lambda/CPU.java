package aufgabe.lambda;

import java.util.ArrayList;

public class CPU {

	private int anzahlKerne;
	private String hersteller;
	
	public CPU(int anzahlKerne, String hersteller) {
		super();
		this.anzahlKerne = anzahlKerne;
		this.hersteller = hersteller;
	}


	public static void main(String[] args) {
		
		ArrayList<CPU> list = new ArrayList<CPU>();
		list.add(new CPU(4, "Firma 1"));
		list.add(new CPU(6, "Firma 2"));
		list.add(new CPU(8, "Firma 3"));
		list.add(new CPU(10, "Firma 4"));
		
		
		list.forEach((cpu) -> System.out.println(cpu.hersteller));
	}
	
}
