public class Task34 {
	public static void main(String[] args) {
		printResult(new int[] { 1, 3, 5, 5, 6, 7, 8, 9 });
		printResult(new int[] { 0, -6, 3, 1, -8, -8, 6, 1 });
	}

	private static int task34(int[] A) {
		if (A.length == 0) {
			throw new IllegalArgumentException();
		}
		int largestElementsIndex = 0;

		for (int i = 0; i < A.length; ++i) {
			if (Math.abs(A[i]) > A[largestElementsIndex]) {
				largestElementsIndex = i;
			}
		}

		return largestElementsIndex;
	}

	private static void printResult(int[] A) {
		try {
			System.out.println(task34(A));
		} catch (Exception exception) {
			System.out.println("Exception at task34!");
		}
	}
}