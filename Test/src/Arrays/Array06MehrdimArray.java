package Arrays;

import java.util.Arrays;

public class Array06MehrdimArray {
	public static void main(String[] args) {
		int[][] a1 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
		System.out.println(Arrays.deepToString(a1));
		System.out.println(a1[0].length);
		
		
		String position = chessBoardCoord(3, 4);
		System.out.println(position);
		
		as();
	}
	static void as () {
		System.out.println("---------------");
		
		int[] arr = {1,2,3};
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
    }
}
