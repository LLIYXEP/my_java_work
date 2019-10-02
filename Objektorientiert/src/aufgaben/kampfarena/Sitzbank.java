package aufgaben.kampfarena;

import java.util.Arrays;
import java.util.Random;

public class Sitzbank {
	
	private Kampfer[] data = new Kampfer[8];
	
	private int index = 0;  // Die Position in Array data, die frei ist und beim nachsten Aufruf der add-Methode belegt wird
	
	public void add(Kampfer k) {
		if (index == data.length) {
			data = Arrays.copyOf(data, data.length + 4);
		}
		
		data[index] = k;
		index++;
	}
	
	public int getSize() {
		return index;
	}
	
//	Entfernt liefert einen zuf Kampfer. Oder liefert null, wenn es leine Lampfer gibt
	public Kampfer removeRandom() {
		if (index == 0) {
			return null;
		}
		
		Random random = new Random();
		int randomIndex = random.nextInt(index);
		
		Kampfer k = data[randomIndex];
		
		for (int i = randomIndex+1; i < index; i++) {
			data[i-1] = data[i];
		}
		
		index--;
		
		return k;
	}
	
	@Override
	public String toString() {
		String text = "";
		
		for (int i = 0; i < index; i++) {
			Kampfer k = data[i];
			text += k;
			
			if (i < index-1) {
				text +=  ", ";
			}
		}
		
		return text;
	}
	
//	public static void main(String[] args) {
//		Sitzbank bank = new Sitzbank();
//		
//		int size = bank.getSize();
//		
//		System.out.println(size == 0 ? "ok" : "1. size != 0");
//		
//		bank.add(new Kampfer("Tom"));
//		
//		size = bank.getSize();
//		System.out.println(size == 1 ? "ok" : "2. size != 0");
//		
//		bank.add(new Kampfer("Jarry"));
//		
//		size = bank.getSize();
//		System.out.println(size == 2 ? "ok" : "3. size != 0");
//		
//		String s = bank.toString();
//		System.out.println("Tom, Jarry".equals(s) ? "ok" : "4. Fehler. toString liefert nicht 'Tom, Jerry'");
//		
//		Kampfer k = bank.removeRandom();
//		System.out.println( k != null ? "ok" : "5.a Fehler: removeRendom lieferte null");
//		size = bank.getSize();
//		System.out.println(size == 1 ? "ok" : "2. size != 0");
//		
//		k = bank.removeRandom();
//		System.out.println( k != null ? "ok" : "6.a Fehler: removeRendom lieferte null");
//		size = bank.getSize();
//		System.out.println(size == 0 ? "ok" : "2. size != 0");
//		
//		for (int i = 0; i < 10; i++) {
//			bank.add(new Kampfer("K"+i));
//		}
//		
//		size = bank.getSize();
//		System.out.println(size == 10 ? "ok" : "2. size != 10");
//		
//		System.out.println(bank);
//	}
}
