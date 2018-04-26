
public class DoWhile {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(++num);

		int num2 = 7;
		System.out.println(num2--);
		System.out.println(num2);

		int counter = 100; // Variable declared outside of loop so that the while
							// condition can detect it.

		// The do loop will always execute the code between its brackets at least once.
		do {
			System.out.println("Counter: " + counter--);
			//--counter;
		} while (counter > 0);

	}

}
