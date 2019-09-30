package Sablon;

public class AbstrFabric {
	public static void main(String[] args) {
		
	}
	
	private static DeviceFactory getFactoryByCountryCode(String lang) {
		switch (lang) {
		case "RU":
			return new RuDeviceFactory();
		case "EN":
			return new EnDeviceFactory();
		default:
			throw new RuntimeException("Unsupported Conutry Code " + lang);
		}
	}
}



interface Mouse{
	void click();
	void dblClick();
	void scroll(int direction);
}

interface Keyboard{
	void print();
	void printIn();
}

interface Touchpad{
	void track(int deltaX, int deltaY);
}

interface DeviceFactory{
	Mouse getMouse();
	Keyboard getKeyboard();
	Touchpad getTouchpad();
}

class RuMouse implements Mouse{
	public void click() {System.out.println("Щелчое mi6koi");}
	public void dblClick() {System.out.println("Двойной щелчёк mi6koi");}
	public void scroll(int direction) {
		if (direction>0) {
			System.out.println("Прокрут up");
		} else if (direction<0) {
			System.out.println("Прокрут down");
		}else {
			System.out.println("Без Прокрута");
		}
	}
}
class EnMouse implements Mouse{
	public void click() {System.out.println("6el4iok mi6koi");}
	public void dblClick() {System.out.println("Dvoinoi 6el4iok mi6koi");}
	public void scroll(int direction) {
		if (direction>0) {
			System.out.println("Scroll up");
		} else if (direction<0) {
			System.out.println("Scroll down");
		}else {
			System.out.println("Ne skrolim");
		}
	}
}

class EnDeviceFactory{
	public Mouse getMouse() {
		return new EnMouse();
	}
}
class RuDeviceFactory{
	public Mouse getMouse() {
		return new RuMouse();
	}
}