import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 7: ");
		int userNum = scnr.nextInt();

		switch (userNum) {
		case 1:
			System.out.println("You entered 1.");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("The number you entered is even.");
			break;
		case 3:
		case 5:
			System.out.println("The number you entered is odd.");
			break;
		case 7:
			System.out.println("You entered lucky number seven.");
			break;
		default: 
			System.out.println("I don't understand you. Please follow the instructions.");
			break;
		}

		scnr.close();

	}

}
