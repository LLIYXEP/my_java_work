package exceptions;

import java.text.ParseException;

@SuppressWarnings("serial")
class AutoEsxception extends Exception { // checked Exc
	
}

class MotorSchadenException extends AutoEsxception {
	
}

class Auto {
	void fahren() throws AutoEsxception {
		
	}
}

class VW extends Auto {
	void fahren() throws MotorSchadenException { // OK: MotorSchadenException IS-A AutoEsxception
		throw new  MotorSchadenException();
	}
}

class Opel extends Auto {
//	void fahren() throws ParseException { // CF : Geschwistertyp-Exception zu AutoExcepton
//	}
}

class Audi extends Auto {
	void fahren() throws RuntimeException { // unchecked Exception
		}
}

class Fiat extends Auto {
	void fahren() { 
	}
}

class Mazda extends Auto {
//	void fahren() throws Exception {  // Is-A
	}
}
	
public class B09_UberschriebenUndCheckedExc {

	public static void main(String[] args) throws AutoEsxception {
		
		Auto a1 = new Opel();
		
//		VW vw1 = new VW();
//		vw1.fahren();
		
		try {
			a1.fahren();
		} catch (AutoEsxception e) {
			// hier AutoEsxception behandeln
			e.printStackTrace();
		}
		
	} // end of main
	
}
