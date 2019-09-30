package Sablon;

import java.util.Date;

public class Fabric {
	public static void main(String[] args) {
//		Watch watch = new DigitalWatch();
//		watch.showTime();
		
		WatchMaker maker = getMakerVyName("Digital");
		
//		WatchMaker maker = new DigitalWatchMaker();
		Watch watch = maker.crWatch();
		watch.showTime();
		
		
	}
	
	public static WatchMaker getMakerVyName(String maker) {
		if (maker.equals("Digital")) {
			return new DigitalWatchMaker();
		}	else if (maker.equals("Rome")) {
			return new RomeWatchMaker();
		}
		
		throw new RuntimeException("Ne podderjivaemaia liniia 4asov " + maker);
	}
}

interface Watch{
	void showTime();
}

class DigitalWatch implements Watch{
	@Override
	public void showTime() {
		System.out.println(new Date());
		
	}
}

class RomeWatch implements Watch{
	@Override
	public void showTime() {
		System.out.println("VII-XX");
		
	}
}

interface WatchMaker{
	Watch crWatch();
}

class DigitalWatchMaker implements WatchMaker{
	public Watch crWatch() {
		return new DigitalWatch();
	}
}

class RomeWatchMaker implements WatchMaker{
	public Watch crWatch() {
		return new RomeWatch();
	}
}