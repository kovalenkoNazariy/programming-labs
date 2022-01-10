public class Task64 {
	public static void main(String[] args) {
		printResult(new int[] { 1, 3, 5, 5, 6, 7, 8, 9 });
		printResult(new int[] { 0, -6, 3, 1, -8, -8, 6, 1 });
	}

	private static int[] task64(int[] A) {
		if (A.length == 0) {
			throw new IllegalArgumentException();
		}
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; ++i) {
			if (A[i] < 0) {
				B[i] = -1 * A[i];
			} else if (A[i] == 0) {
				B[i] = -2;
			} else {
				B[i] = A[i] - 3;
			}
		}

		return B;
	}

	private static void printResult(int[] A) {
		try {
			int[] B = task64(A);

			for (int i = 0; i < B.length; ++i) {
				System.out.print(B[i] + " ");
			}
			System.out.println();
		} catch (Exception exception) {
			System.out.println("Exception at task64!");
		}
	}
}