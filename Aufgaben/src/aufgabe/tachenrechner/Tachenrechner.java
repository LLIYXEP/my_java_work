package aufgabe.tachenrechner;

import java.util.Scanner;

public class Tachenrechner {

	public static void main(String[] args) {
		
		if (args.length == 3) {
			
		} else {
			
		}
		
		String quitStr = "";
		double intNumber1 = 0;
		double intNumber2 = 0;
		String operator = "";
		
		while (true) {
			
			boolean error = false;
			
			
			while (!error) {
				System.out.println("First number");
				try {
					intNumber1 = new Scanner(System.in).nextDouble();
					error = true;
				} catch (Exception e) {
					System.out.println("Invalid number! You cann enter numbers from -2147483648 bis 2147483647");
					
				}
			}
			
			error = false;

			while (!error) {
			System.out.println("Second number");
			try {
				intNumber2 = new Scanner(System.in).nextDouble();
				error = true;
			} catch (Exception e) {
				System.out.println("Invalid number! You cann enter numbers from -2147483648 bis 2147483647");
				}
			}
			
			error = false;

			while (!error) {
			System.out.println("What to make with numbers? ( + , - , * , /)");
			Scanner operatorSc = new Scanner(System.in);	
			try {
				operator = operatorSc.nextLine();
				if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
					error = true;
				} else {
					throw new RuntimeException("Operator Problem");
				}
				
			} catch (Exception e) {
				System.out.println("Invalid Operator! Operator must be one from ( + , - , * , /)");
				}
			}

			
			double result = 0;
			
			switch (operator) {
			case "+":
				result = intNumber1 + intNumber2;
				break;
			case "-":
				result = intNumber1 - intNumber2;
				break;
			case "*":
				result = intNumber1 * intNumber2;
				break;
			case "/":
				result = intNumber1 / intNumber2;
				break;
			}
			
			System.out.println("Your reslut is :  " + result);
			
			System.out.println("Enter to continue! Q to quit");
			Scanner quit = new Scanner(System.in);
			quitStr = quit.nextLine();
			
			
			if (quitStr.equals("Q") || quitStr.equals("q")) {
				System.out.println("You close the Program");
				break;
			}
		}
			
		
	}
	
}
