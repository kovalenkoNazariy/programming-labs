public class Task4 {

	public static void main(String[] args) {
		printResult(new int[] { 1, 3, 5, 5, 6, 7, 8, 9 });
		printResult(new int[] { 0, -6, 3, 1, -8, -8, 6, 1 });
	}

	private static int task4(int[] A) {
		if (A.length == 0) {
			throw new IllegalArgumentException();
		}
		int negativeElements = 0;

		for (int j : A) {
			if (j < 0) {
				negativeElements++;
			}
		}

		return negativeElements;
	}

	private static void printResult(int[] A) {
		try {
			System.out.println(task4(A));
		} catch (Exception exception) {
			System.out.println("Exception at task4!");
		}
	}
}