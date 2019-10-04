package lotto;

public class LottoSpielSimulation {
	public static void main(String[] args) {
		LottoSpiel lottoSpiel = new LottoSpiel(7, 49);
		
		lottoSpiel.ziehen(7, 49);
		
		System.out.println(lottoSpiel);
	}
}
