package kampfarena;

import java.util.Random;


public class Kampfarena {
	public static void main(String[] args) {
		
		
		
//		Kampfers Array Init-----------------------------------------------1
		Kampfer[] kampfers = new Kampfer[8];

//		Add 8 Kampfers----------------------------------------------------2
		for (int i = 0; i < kampfers.length; i++) {
			Kampfer k = new Kampfer("Valera" + i);
			kampfers[i] = k;
		}
		
//      Say Hello For Extremals-------------------------------------------3
		System.out.println("Hello Kampfers!");
		for (int i = 0; i < kampfers.length; i++) {
			if (i == kampfers.length-1) {
				System.out.print(kampfers[i]);
			} else {
				System.out.print(kampfers[i] + ", ");
			}
		}
		
		System.out.println();
		System.out.println("\n*****Lets Strat the party*****");
		
		
//		Main Process-------------------------------------------------------4
		for (int i = 0; i <= 8; i++) {
			
			if (kampfers.length > 1) {
				
				Random random = new Random();
				int rand = random.nextInt(kampfers.length);
				int rand2 = random.nextInt(kampfers.length);
				
					Kampfer pl1 = kampfers[rand];
					Kampfer pl2 = kampfers[rand2];
					
					if (pl1 == pl2) {
						pl2 = kampfers[kampfers.length-1];
					} else if (pl1 == pl2 && pl1 == kampfers[kampfers.length-1]) {
						pl2 = kampfers[kampfers.length-2];
					} else if (pl1 == pl2 && pl1 == kampfers[0]) {
						pl2 = kampfers[1];
					}
					
					System.out.println("Next players are: " + pl1 + " und " + pl2);
					
					
					Kampfer deadHero = whoIsDead(pl1, pl2);
					System.out.println("----------------------");
					
					kampfers = delHero(kampfers, deadHero);
			}
			
			
		}
		
//		Give Flowers-------------------------------------------------------5
		for (Kampfer kampfer : kampfers) {
			System.out.println("And the Chempion is " + kampfer + ". Take your flowers and go home!");
		}
		
		
		
		
	}
	
	static boolean verifyIfExists(Kampfer[] kampfers, Kampfer kampf) {
		
		for (Kampfer kampfer : kampfers) {
			if (kampf != kampfer) {
				return false;
			} 
		}
		
		return true;
	}
	
	static Kampfer whoIsDead(Kampfer pl1, Kampfer pl2) {
		int chance = pl1.schlagen();
		Kampfer isDead = null;
		for (int i = 0; i < 100; i++) {
			if (chance > 10) {
				System.out.println(pl1.name + " Make Boom!");
				chance = pl2.schlagen();
				if (chance > 10) {
					System.out.println(pl2.name + " Make Boom!");
					chance = pl1.schlagen();
				}else {
					System.out.println("Wow, KO-Schlag! Hahaha " + pl1 + " is dead!" );
					System.out.println(pl2 + " you have litle time to eat Eis!");
					isDead = pl1;
					break;
				}
			} else {
				System.out.println("Wow, KO-Schlag! Hahaha " + pl2 + " is dead!" );
				System.out.println(pl1 + " you have litle time to eat Eis!");
				isDead = pl2;
				break;
			}
		}
		return isDead;
	}
	
	static Kampfer[] delHero(Kampfer[] kampfers, Kampfer del) {
		Kampfer[] anotherArray = new Kampfer[kampfers.length - 1];
		for (int i = 0, k = 0; i < kampfers.length; i++) {
			if (kampfers[i].name == del.name) {
				continue;
			} else {
				anotherArray[k++] = kampfers[i];
			}
		}
		return anotherArray;
	}
	
	
}
