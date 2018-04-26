
public class WhileLoopInfiniteEx {

	public static void main(String[] args) {

		// This code will run endlessly unless we add a stop condition.
		while (true) {

			int randomNum = (int) (Math.random() * 10); // Will generate a number between 0 and 9.

			System.out.println(randomNum);

			// To break out of this loop, we added a conditional statement with the break
			// keyword.
			if (randomNum == 7) {
				System.out.println("The number 7 has been found!");
				break;
			}
		}

		System.out.println(); // This is just for formatting purposes.

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10);

			// System.out.println("Random: " + randomNum);

			if (randomNum > 7) {
				System.out.println("Invalid number--go to the top of the loop.");
				continue;
			}
			System.out.println(randomNum); // only going to execute if random <= 7
		}
	}
}
