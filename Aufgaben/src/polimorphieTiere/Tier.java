package polimorphieTiere;

public abstract class Tier {
	private String name;
	private int alter;
	private boolean gesund;
	
	abstract void laufen();
	
	
	
	public Tier(String name, int alter, boolean gesund) {
		super();
		this.name = name;
		this.alter = alter;
		this.gesund = gesund;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public boolean isGesund() {
		return gesund;
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}
	
	
}
