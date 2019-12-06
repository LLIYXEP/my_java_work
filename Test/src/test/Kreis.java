package test;

import java.util.ArrayList;

import test2.Auto;


public class Kreis extends Auto {
	
	static int MIN_BJ = 1990;
	
	public void start() {
		System.out.print( test2.Auto.MIN_BJ + " " );
		System.out.print( Auto.MIN_BJ + " " );
		System.out.print( MIN_BJ );
	} 

	public static void main(String[] args) {
		
		new Kreis().start();
		
	}
	
	
	
	
	
}
