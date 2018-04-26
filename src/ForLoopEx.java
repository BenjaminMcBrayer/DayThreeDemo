
public class ForLoopEx {

	public static void main(String[] args) {

		/*for (int i = 0; i <= 10; ++i) {
			System.out.println(i + " Hello");
		}
		*/
		
		//You can access i outside of the for loop by declaring it outside of the for loop.
		int i = 0;
		for (i = 150; i >= 100; --i) {
			System.out.println(i + " Hello");
		}
		System.out.println(i);
	}

}
