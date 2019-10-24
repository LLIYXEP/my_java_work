package aufgabe.ruteforce;

public class Safe {
	private char[] password;
	
	public Safe(char[] password) {
		this.password = password;
	}
	
	public boolean open(char[] passwordToTry) {
		boolean result = false;
		for (int i = 0; i < passwordToTry.length; i++) {
			if (this.password[i] != passwordToTry[i]) {
				result = false;
				break;
			} else result = true;
		}
		return result;
	}
}
