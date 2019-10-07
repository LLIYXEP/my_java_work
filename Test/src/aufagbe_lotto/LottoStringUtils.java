package aufagbe_lotto;

import java.util.Arrays;

public class LottoStringUtils {
	public static String formatNumberArray(int anzahlKugel, int anzahlKugelGesamt, int[] zahlen, String prefix, String suffix) {
		String text = prefix + " " + anzahlKugel + " aus " + anzahlKugelGesamt + ". ";
		
		if (zahlen == null) {
			text += suffix;
		} else {
			text += Arrays.toString(zahlen);
		}
		
		return text;
	}
}
