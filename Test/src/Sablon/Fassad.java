package Sablon;

public class Fassad {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.copy();
	}
}

class Computer{
	Power power = new Power();
	DVDRom dvd = new DVDRom();
	HDD hdd = new HDD();
	
	void copy() {
		power.on();
		dvd.load();
		hdd.copyfromDVD(dvd);
	}
}

class Power {
	void on() {
		System.out.println("Vkliu4enie pitaniia");
	}
	void off() {
		System.out.println("Vikliu4enie pitaniia");
	}
}

class DVDRom {
	private boolean data = false;
	public boolean hasData() {
		return data;
	}
	void load() {
		data = true;
	}
	void unload() {
		data = false;
	}
}

class HDD{
	void copyfromDVD(DVDRom dvd) {
		if (dvd.hasData()) {
			System.out.println("Proishodit kopirovanie");
		} else {
			System.out.println("Vstavite disk s dannimi");
		}
	}
}