package exceptions;

import java.io.IOException;

public class HomeExceptions {

	public static void main(String[] args) throws Exception {
		
		someMethod();
		
	}
	
	static void someMethod() throws IOException {
		
		throw new IOException();
		
	}
	
}
