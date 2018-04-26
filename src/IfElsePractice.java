import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter your age: ");

		int age = scnr.nextInt();

		if (age >= 18) {
			System.out.println("Congrats! You can legally vote!");
		} else if (age >=16 && age < 18) {
			System.out.println("You'll be ready to vote soon. Educate yourself!");
		} else {
			System.out.println("Hey, you're not old enough to vote! But you are old enough to do some research.");
		}
		
		scnr.close();
	}

}