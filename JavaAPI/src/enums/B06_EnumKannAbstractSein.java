package enums;

enum Namen implements Runnable { // Runnable deklariert eine abstrakte Methode 'run()'
	TOM {
		@Override
		String displayName() {
			// TODO Auto-generated method stub
			return "Tom";
		}

		@Override
		public void run() {
			System.out.println(displayName() + " lauft");	
		}
	},
	JERRY {
		@Override
		String displayName() {
			// TODO Auto-generated method stub
			return name();
		}

		@Override
		public void run() {
			System.out.println(displayName() + " lauft");
		}
	};
	
	abstract String displayName(); // muss fur jede Konstante realisiert werden
	
	void test() {
		run();
	}
	
}

public class B06_EnumKannAbstractSein {

	public static void main(String[] args) {
		
		System.out.println(Namen.TOM.displayName());
		System.out.println(Namen.JERRY.displayName());
		
	}
	
}
