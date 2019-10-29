package aufgabe.nested_auto;

import aufgabe.nested_auto.Rennwagen.Fahrer;

class Rennwagen implements SetFahrer{
	
	public static class Motor{
		public Rennwagen.Motor getMotor() {
			return this.getMotor();
		}
	} // end of Mortor
	
	public static class Fahrer{
		Rennwagen renn = new Rennwagen("Test");
		public Fahrer(String name, String mark) {
			
			super();
			renn.name = name;
			renn.mark = mark;
		}
		
	} // end of Fahrer
	
	private String name;
	private String mark;

	public Rennwagen(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rennwagen [name=" + name + "]";
	}
	
	@Override
	public void setFahrer(Rennwagen.Fahrer f) {
		this.name = f.renn.name;
	}

	public String getMotor() {
		return this.mark;
	}

	
} // end of Rennwagen

interface SetFahrer{

	void setFahrer(Fahrer f);
}

public class NestedAuto {

	public static void main(String[] args) {
		
		Rennwagen rw = new Rennwagen("Mercedes");
		
	    Rennwagen .Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
	    rw.setFahrer(f);
	
	    Rennwagen.Motor m = rw.getMotor();
	
	    System.out.println(rw);		//Zeile A
	    System.out.println(m);		//Zeile B
		
	}
	
}
