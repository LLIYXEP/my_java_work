package wdh.z;

//import static wdh.t.Tier.MAX_ALTER // nicht sichtbar

import static wdh.t.Tier.getMax;

public class AccessTier {

	public static void main(String[] args) {
		
//		System.out.println(wdh.t.Tier.MAX_ALTER); // nicht sichtbar
		
//		System.out.println(Tier.getMax()); // Tier ist nicht bekant
		
		System.out.println(getMax());
		
	}
	
}
