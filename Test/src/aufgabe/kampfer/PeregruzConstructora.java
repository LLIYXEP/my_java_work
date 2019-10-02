package Klassen2;

class OS {
	String name;
	int majorVersion;
	int minorVersion;
	
	OS(String name){
		this.name = name;
	}
	
	
	OS(String name, int majorVersion){
		
		this(name, majorVersion, 0); // Vizivaetsia OS(String name, int majorVersion, int minorVersion)
		System.out.println("im Constructor (String , int) ");
//		this.name = name;
//		this.majorVersion = major;
	}
	
	OS(String name, int majorVersion, int minorVersion){
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Der Name darf nicht leer sein");
		}
		
		if (majorVersion < 0) {
			throw new IllegalArgumentException("Bad majorVersion " + majorVersion);
		}
		
		if (minorVersion < 0) {
			throw new IllegalArgumentException("Bad minorVersion " + minorVersion);
		}
		
		this.name = name;
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		System.out.println("im Constructor (String , int, int) ");
	}
	
	public String toString() {
		
		return name + " " + majorVersion + "." + minorVersion;
	}
}

public class PeregruzConstructora{
	public static void main(String[] args) {
		OS os1 = new OS("Mac", 10, 0);
		System.out.println(os1);
		System.out.println("----------------------------");
		

		OS os2 = new OS("Windows", 10);
		System.out.println(os2);
		System.out.println("----------------------------");
		
		OS os3 = new OS("Windows");
		System.out.println(os3);
	}
}
