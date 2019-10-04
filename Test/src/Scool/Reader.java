package Scool;

import java.util.Scanner;

public class Reader {
	int i;
	int k;
	
	public void scan() {
		System.out.println("Vvedite pervoe 4islo");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
		System.out.println("Vvedite vtoroe 4islo");
		k = scn.nextInt();
	}
}
