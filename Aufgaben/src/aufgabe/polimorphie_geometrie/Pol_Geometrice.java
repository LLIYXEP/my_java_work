package aufgabe.polimorphie_geometrie;

import java.util.ArrayList;
import java.util.List;

public class Pol_Geometrice {

	public static void main(String[] args) {
		
		Rechteck rechteck = new Rechteck(0, 0, 100, 200);
		System.out.println(rechteck);
		rechteck.bewegen(5, 7);
		System.out.println(rechteck);
		
		System.out.println();
		
		Kreis kreis = new Kreis(0, 0, 12);
		System.out.println(kreis);
		kreis.bewegen(5, 7);
		System.out.println(kreis);
		
		flacheBerechnen(rechteck);
		flacheBerechnen(kreis);
		
		System.out.println();
		
		ArrayList<Figure> fList= makeFigure(100);
		
		System.out.println("Array size " + fList.size());
		
		
		jedeFigureFlasxheBerechnen(fList);
		
	}
	
	static void flacheBerechnen(Figure figure) {
		System.out.println("Fläche berechnen von einen: " + figure.getClass().getSimpleName());
		figure.getFlaeche();
	}
	
	static ArrayList<Figure> makeFigure(int x) {
		ArrayList<Figure> list = new ArrayList<Figure>();
		
		for (int i = 0; i < x; i++) {
			if (i % 2 == 0) {
				Rechteck rechteck = new Rechteck(i+1, i+2, i+50, i+100);
				list.add(rechteck);
			} else if(i % 2 == 1){
				Kreis kreis = new Kreis(i+1, i+4, i+28);
				list.add(kreis);
			}
		}
		return list;
	}
	
	static ArrayList<Integer> jedeFigureFlasxheBerechnen(ArrayList<Figure> list){
		ArrayList<Integer> flascheList = new ArrayList<Integer>(); 
		
		for (int i = 0; i < list.size(); i++) {
			Figure figure = list.get(i);
			figure.getFlaeche();
		}
		
		return flascheList;
	}
	
	
}
