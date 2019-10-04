package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoSpiel {
	int anzahlKugel = 0;
    int anzahlKugelGesamt = 0;
    ArrayList<Integer> numbers;
    
    LottoSpiel(int k, int kg){
    	this.anzahlKugel = k;
    	this.anzahlKugelGesamt = kg;
    }
    
    ArrayList<Integer> ziehen(int anzahlKugel,int anzahlKugelGesamt) {
    	Random random = new Random();
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	for (int i = 0; i < anzahlKugel ; i++) {
    		int number = random.nextInt(anzahlKugelGesamt) + 1;
    		numbers.add(number);
		}
    	return this.numbers = numbers;
    }
    
    @Override
    public String toString() {
    	return "Spiel " + this.anzahlKugel + " aus " + anzahlKugelGesamt + "." + numbers;
    }
    
    
  

}
