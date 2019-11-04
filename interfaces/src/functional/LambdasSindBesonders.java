package functional;

interface MyFuncTinterface{
	String getString();
}

public class LambdasSindBesonders {

	public static void main(String[] args) {
		
		/*
		 * Unterschied in der Realisierung einer 'normalen' Klasse und eine Lambda ist nicht in der Prufung
		 * 
		 */
		
		class Montag {

			@Override
			public String toString() {
				return "Monrag/ toString/ this-Klassenname: " + this.getClass().getName();
			}
			
		}
		
		System.out.println(new Montag());
		
		
		Object obj = new Object() {
			
			@Override
			public String toString() {
				return "Anonym/ toString/ this-Klassenname: " + this.getClass().getName();
			}
			
		};
		
		System.out.println(obj);
		
		
		MyFuncTinterface var = () ->  "Lambda/ toString/hat kein this:"; // + this.getClass().getName();
		
		
		new LambdasSindBesonders().test();
	}
	
	void test() {
		MyFuncTinterface var = () ->  "this des aussern Objektes:" + this.getClass().getName();
		System.out.println(var.getString());
	}
	
}
