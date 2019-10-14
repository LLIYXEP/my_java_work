package aufgabe_ruteforce;

public class Aufgabe_Bruteforce {
	public static void main(String[] args) {
		
		char[] myPass = {'a','b','c','d'};
		char[] openPass = {'a','b','f','d'};
		
		Safe safe = new Safe(myPass);
		boolean result = safe.open(openPass);
		System.out.println(result);
		
		permutationByHeap(myPass, myPass.length);
	}
	
	public static void permutationByHeap(char[] arr, int pointer) {
		
        if (pointer == 1) {
        	System.out.println("Kombination: " + java.util.Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < pointer - 1; i++) {
        	permutationByHeap(arr, pointer - 1);

            if (pointer % 2 == 0) {
                char tmp = arr[pointer - 1];
                arr[pointer - 1] = arr[i];
                arr[i] = tmp;
            } else {
                char tmp = arr[pointer - 1];
                arr[pointer - 1] = arr[0];
                arr[0] = tmp;
            }
        }

        permutationByHeap(arr, pointer - 1);
    }
}


