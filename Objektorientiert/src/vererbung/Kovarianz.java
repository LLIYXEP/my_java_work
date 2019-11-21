package vererbung;

import java.io.IOException;

public class Kovarianz {

	static class Auto {}
	
	static class PKW extends Auto{}
	
	static class AutoFabrik{
		public Auto getAuto() throws IOException {
			return new Auto();
		}
	}
	
	static class PKWFabrik extends AutoFabrik{
		public Auto getAuto() throws IOException {
			return new PKW();
		}
	}
	
	public static void main(String[] args) {
		
		
	}
	
}
